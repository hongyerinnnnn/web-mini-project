package com.multi.travel.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/travel")
public class TravelImageController {

    private final String serviceKey = "490dff3a74450adae8e1524024697a4e35ce97f3bb37436d4be589e01bcd36a5 일반키";  // 서버용 일반키

    @GetMapping("/image")
    public Map<String, Object> getImage(@RequestParam String title) {
        Map<String, Object> map = new HashMap<>();
        try {
            String urlStr = "https://apis.data.go.kr/B551011/KorService2/searchKeyword2"
                    + "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8")
                    + "&MobileOS=ETC&MobileApp=AppTest"
                    + "&_type=json&keyword=" + URLEncoder.encode(title, "UTF-8")
                    + "&numOfRows=1&pageNo=1";

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(urlStr, String.class);

            JSONObject json = new JSONObject(result);
            JSONObject response = json.getJSONObject("response");
            JSONObject body = response.getJSONObject("body");
            JSONObject items = body.getJSONObject("items");
            Object itemObj = items.get("item");

            String img = null;
            if (itemObj instanceof JSONArray) {
                img = ((JSONArray) itemObj).getJSONObject(0).optString("firstimage", null);
            } else if (itemObj instanceof JSONObject) {
                img = ((JSONObject) itemObj).optString("firstimage", null);
            }

            map.put("image", img != null && !img.isEmpty() ? img : "/img/default.jpg");
        } catch (Exception e) {
            map.put("image", "/img/default.jpg");
        }
        return map;
    }
}
