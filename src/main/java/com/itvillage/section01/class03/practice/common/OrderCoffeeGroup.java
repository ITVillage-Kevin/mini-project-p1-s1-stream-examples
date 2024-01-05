package com.itvillage.section01.class03.practice.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode   // Stream으로 그룹핑을 할 때, 기준이 되는 키를 구분한다.
public class OrderCoffeeGroup {
    private long orderId;
    private long memberId;
    private String createdAt;

    public OrderCoffeeGroup(OrderCoffee orderCoffee) {
        this.orderId = orderCoffee.getOrderId();
        this.memberId = orderCoffee.getMemberId();
        this.createdAt = orderCoffee.getCreatedAt();
    }
}
