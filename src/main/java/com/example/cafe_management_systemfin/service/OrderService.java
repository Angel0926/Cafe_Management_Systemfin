package com.example.cafe_management_systemfin.service;

import com.example.cafe_management_systemfin.dto.responce.OrderResponseDto;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface OrderService {

    OrderResponseDto createOrder(Long tableId) throws Exception;

    OrderResponseDto update(Long id) throws Exception;

    OrderResponseDto delete(Long id) throws UserPrincipalNotFoundException;

    OrderResponseDto findById(Long tableId) throws UserPrincipalNotFoundException;

    public Map<String, Integer> getOrdersByAllWaiter(Date date);

    public List<OrderResponseDto> findAllOrderByData(Date date);
}
