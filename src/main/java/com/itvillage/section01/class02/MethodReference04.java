package com.itvillage.section01.class02;

import com.codestates.common.Coffee;
import com.codestates.common.TriFunction;

/**
 * Constructor::new 예
 */
public class MethodReference04 {
    public static void main(String[] args) {
        TriFunction<String, String, Integer, Coffee> f1 = (String korName, String engName, Integer price) -> new Coffee(korName, engName, price);
        Coffee coffee1 = f1.apply("카페 라떼", "Cafe Latte", 4000);
        System.out.println(coffee1.getKorName());

        TriFunction<String, String, Integer, Coffee> f2 = (korName, engName, price) -> new Coffee(korName, engName, price);
        Coffee coffee2 = f2.apply("카페 라떼", "Cafe Latte", 4000);
        System.out.println(coffee2.getKorName());

        TriFunction<String, String, Integer, Coffee> f3 = Coffee::new;
        Coffee coffee3 = f3.apply("바닐라 라떼", "Vanilla Latte", 5000);
        System.out.println(coffee3.getKorName());
    }
}
