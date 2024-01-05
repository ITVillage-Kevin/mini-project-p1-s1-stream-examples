package com.itvillage.section01.class03.practice;

import com.itvillage.section01.class03.practice.common.Car;
import com.itvillage.section01.class03.practice.common.SampleDatasource;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 중복이 제거된 자동차 브랜드를 출력하는 예제
 */
public class StreamPractice01 {
    public static void main(String[] args) {
        SampleDatasource.cars.stream()
                .filter(distinctByCarBrand(Car::getCarBrand))
                .forEach(car -> System.out.println(car.getCarBrand() + ", " + car.getName()));
    }

    private static <T> Predicate<T> distinctByCarBrand(Function<? super T, Car.CarBrand> extractor) {
        Set<Car.CarBrand> set = new HashSet<>();
        return t -> set.add(extractor.apply(t));
    }
}
