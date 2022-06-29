package com.example.cafe_management_systemfin.validator;

import com.example.cafe_management_systemfin.domain.entity.AssortmentOrder;
import com.example.cafe_management_systemfin.domain.entity.Order;
import com.example.cafe_management_systemfin.domain.enums.AssortmentStatus;
import com.example.cafe_management_systemfin.domain.enums.OrderStatus;

public class AssortmentOrderValidator {

    public static boolean isOrderOpen(Order order) {

        return order.getOrderStatus().equals(OrderStatus.OPEN);
    }

    public static boolean isAssortmentOrderCancelled(AssortmentOrder assortmentOrder) {

        return assortmentOrder.getAssortmentStatus().equals(AssortmentStatus.CANCELLED);
    }
}
