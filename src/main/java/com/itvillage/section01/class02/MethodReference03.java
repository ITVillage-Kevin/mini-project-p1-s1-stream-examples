package com.itvillage.section01.class02;

import com.codestates.common.CoffeeInventory;

import java.util.function.Function;

/**
 * 람다 표현식 바깥 쪽의 Class Name::instance method 예제
 */
public class MethodReference03 {
    public static void main(String[] args) {
        final CoffeeInventory coffeeInventory = new CoffeeInventory(10);

        Function<Integer, Integer> f1 = (Integer count) -> coffeeInventory.calculateTotalCount(count);
        int totalCount1 = f1.apply(10);
        System.out.println(totalCount1);

        Function<Integer, Integer> f2 = count -> coffeeInventory.calculateTotalCount(count);
        int totalCount2 = f2.apply(10);
        System.out.println(totalCount2);

        Function<Integer, Integer> f3 = coffeeInventory::calculateTotalCount;
        int totalCount3 = f3.apply(10);
        System.out.println(totalCount3);
    }
}
