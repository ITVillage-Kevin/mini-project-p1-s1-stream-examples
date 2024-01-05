package com.itvillage.section01.class03.practice.common;

import static com.itvillage.section01.class03.practice.common.Car.CarBrand;
import static com.itvillage.section01.class03.practice.common.Car.CarType;

import java.util.List;

public class SampleDatasource {
    public static List<Car> cars = List.of(
            new Car(CarBrand.Volkswagen, CarType.SEDAN, "티구안", 23_000_000, true),
            new Car(CarBrand.BMW, CarType.SUV,"미니",  33_000_000, true),
            new Car(CarBrand.Benz, CarType.SUV,"지바겐", 50_000_000, true),
            new Car(CarBrand.Benz, CarType.SEDAN, "E-Class",  28_000_000, true),
            new Car(CarBrand.Ford, CarType.SUV, "익스플로러",  18_000_000, true),
            new Car(CarBrand.Jeep, CarType.SUV, "랭글러",  23_000_000, true),
            new Car(CarBrand.Volkswagen, CarType.SUV, "투아렉",  40_000_000, true),
            new Car(CarBrand.Volkswagen, CarType.SUV, "골프",  43_000_000, true),
            new Car(CarBrand.Jeep, CarType.SEDAN, "체로키",  35_000_000, true),
            new Car(CarBrand.Jeep, CarType.PICKUPTRUCK, "글래디에이터",  45_000_000, true)
    );

    // A Bakery 지점의 월별 매출
    public static final List<Integer> salesOfBakeryA = List.of(
            5_000_000, 5_000_000, 4_500_000, 5_000_000, 3_000_000, 4_000_000, 5_000_000, 5_500_000,
            3_500_000, 6_000_000, 4_500_000, 4_500_000
    );

    // B Bakery 지점의 월별 매출
    public static final List<Integer> salesOfBakeryB = List.of(
            3_000_000, 3_500_000, 3_300_000, 2_600_000, 3_000_000, 4_000_000, 5_500_000, 3_700_000,
            5_300_000, 4_400_000, 3_500_000, 3_000_000
    );

    // B Bakery 지점의 월별 매출
    public static final List<Integer> salesOfBakeryC = List.of(
            6_000_000, 5_500_000, 4_800_000, 6_700_000, 7_000_000, 5_500_000, 3_500_000, 7_200_000,
            5_300_000, 6_200_000, 7_000_000, 8_000_000
    );

    public static final List<OrderCoffee> orderCoffees = List.of(
            new OrderCoffee(1L, 1L, "2023-01-25T16:14:28.087671300", 1L,
                    1, "아메리카노", "Americano", 2500, "AMR"),
            new OrderCoffee(1L, 1L, "2023-01-25T16:14:28.087671300", 2L,
                    2, "바닐라 라떼", "Vanilla Latte", 4500, "VNL"),
            new OrderCoffee(2L, 2L, "2023-01-26T16:14:28.087671300", 1L,
                    1, "아메리카노", "Americano", 2500, "AMR"),
            new OrderCoffee(3L, 3L, "2023-01-27T16:14:28.087671500".toString(), 1L,
                    1, "아메리카노", "Americano", 2500, "AMR"),
            new OrderCoffee(3L, 3L, "2023-01-27T16:14:28.087671500", 3L,
                    2, "카라멜 라떼", "Caramel Latte", 5000, "CRL"));
}
