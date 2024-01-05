package com.itvillage.section01.class03.practice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderCoffeeResponse {
    private long coffeeId;
    private String korName;
    private String engName;
    private int price;
    private int quantity;
}
