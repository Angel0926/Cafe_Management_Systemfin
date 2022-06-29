package com.example.cafe_management_systemfin.service;


import com.example.cafe_management_systemfin.dto.request.CafeTableRequestDto;
import com.example.cafe_management_systemfin.dto.responce.CafeTableResponseDto;

import java.util.List;

public interface CafeTableService {

    CafeTableResponseDto createCafeTable(Long userId, CafeTableRequestDto cafeTableRequestDto) ;

    CafeTableResponseDto deleteById(Long id) ;

    List<CafeTableResponseDto> getAllFreeTables();

    List<CafeTableResponseDto> getTableByWaiterId(Long userId) ;
    CafeTableResponseDto updateName(String name, String newName) ;

    CafeTableResponseDto updateWaiter(Long id, Long userId) ;
}
