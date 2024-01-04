package com.itvillage.section01.class02;

import com.codestates.common.Coffee;

import java.util.function.Function;

/**
 * Class Name::instance method 축약 예제
 */
public class MethodReferenceExample02 {
    public static void main(String[] args) {
        Function<Coffee, String> f1 = (Coffee coffee) -> coffee.getKorName();  // 람다 파라미터가 어떤 클래스의 인스턴스
        String korName1 = f1.apply(new Coffee("카페라떼", "Cafe Latte", 4000));
        System.out.println(korName1);

        Function<Coffee, String> f2 = coffee -> coffee.getKorName();  // 람다 파라미터가 어떤 클래스의 인스턴스
        String korName2 = f2.apply(new Coffee("카페라떼", "Cafe Latte", 4000));
        System.out.println(korName2);

        Function<Coffee, String> f3 = Coffee::getKorName;       // 클래스 인스턴스 메서드의 축약
        String korName3 = f3.apply(new Coffee("카페라떼", "Cafe Latte", 4000));
        System.out.println(korName3);
    }
}
