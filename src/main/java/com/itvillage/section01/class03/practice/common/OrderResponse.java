package com.itvillage.section01.class03.practice.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderResponse {
    private long orderId;
    private long userId;
    private String createdAt;
    private List<OrderCoffeeResponse> orderCoffees;
}
