package com.example.cafe_management_systemfin.validator;

import com.example.cafe_management_systemfin.domain.entity.Order;
import com.example.cafe_management_systemfin.domain.enums.OrderStatus;
import com.example.cafe_management_systemfin.dto.responce.AssortmentOrderResponseDto;
import com.example.cafe_management_systemfin.service.AssortmentOrderService;

import java.util.List;

public class OrderValidator {

    private static final AssortmentOrderService assortmentOrderService = null;


    public static boolean isOrderStatusOpen(Order order) {

        return order.getOrderStatus().equals(OrderStatus.CLOSED);
    }

    public static boolean haveOrderAssortment(Long id) {

        List<AssortmentOrderResponseDto> assortmentOrderResponseDtoList =
                assortmentOrderService.getByOrder(id);

        return assortmentOrderResponseDtoList.isEmpty();
    }
}
