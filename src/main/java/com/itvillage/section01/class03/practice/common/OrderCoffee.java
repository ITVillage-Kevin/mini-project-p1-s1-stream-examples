package com.itvillage.section01.class03.practice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
public class OrderCoffee {
    private long orderId;
    private long memberId;
    private String createdAt;
    private long coffeeId;
    private int quantity;
    private String korName;
    private String engName;
    private int price;
    private String coffeeCode;
}
