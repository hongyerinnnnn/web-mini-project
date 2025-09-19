package com.multi.travel.controller;

import com.multi.travel.dto.TravelDTO;
import com.multi.travel.service.TravelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelRestController {

    private final TravelService travelService;

    public TravelRestController(TravelService travelService) {
        this.travelService = travelService;
    }

    @GetMapping("/api/travels")
    public List<TravelDTO> getTravels() {
        // DB에 데이터가 없으면 빈 리스트 반환
        return travelService.getAllTravel();
    }
}
