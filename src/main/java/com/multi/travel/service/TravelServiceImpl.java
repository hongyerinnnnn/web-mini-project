package com.multi.travel.service;

import com.multi.travel.dto.TravelDTO;
import com.multi.travel.mapper.TravelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {

    private final TravelMapper travelMapper;

    public TravelServiceImpl(TravelMapper travelMapper) {
        this.travelMapper = travelMapper;
    }

    @Override
    public List<TravelDTO> getAllTravel() {
        return travelMapper.selectAll();
    }
}
