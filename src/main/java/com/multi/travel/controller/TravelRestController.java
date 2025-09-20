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

    // ✅ 프론트와 URL 통일 → /api/travels
    @GetMapping("/api/travels")
    public List<TravelDTO> getTravels() {
        return travelService.getAllTravel();
    }
}
