package com.example.cafe_management_systemfin.dto.request;

import com.example.cafe_management_systemfin.domain.entity.CafeTable;
import com.example.cafe_management_systemfin.domain.enums.OrderStatus;

import java.util.Objects;

public class OrderRequestDto {

    private OrderStatus status;
    private CafeTable cafeTable;

    public OrderRequestDto() {
    }

    public OrderRequestDto(OrderStatus status, CafeTable cafeTable) {
        this.status = status;
        this.cafeTable = cafeTable;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public CafeTable getCafeTable() {
        return cafeTable;
    }

    public void setCafeTable(CafeTable cafeTable) {
        this.cafeTable = cafeTable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequestDto that = (OrderRequestDto) o;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "OrderRequestDto{" +
                "status=" + status +
                '}';
    }
}
