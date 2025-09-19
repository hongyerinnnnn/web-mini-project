package com.multi.travel.mapper;

import com.multi.travel.dto.TravelDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TravelMapper {
    List<TravelDTO> selectAll();
}
