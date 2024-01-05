package com.itvillage.section01.class03.practice.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Car {
    private final CarBrand carBrand;
    private final CarType carType;
    private final String name;
    private final int price;
    private final boolean isNew;

    public enum CarBrand {
        BMW,
        Benz,
        Volkswagen,
        Ford,
        Jeep
    }

    public enum CarType {
        SEDAN,
        SUV,
        PICKUPTRUCK

    }
}
