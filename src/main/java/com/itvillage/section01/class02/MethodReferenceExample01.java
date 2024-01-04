package com.itvillage.section01.class02;

import java.util.function.Function;

/**
 * Class Name::static method 축약 예제
 */
public class MethodReferenceExample01 {
    public static void main(String[] args) {
        // 람다 표현식 메서드 레퍼런스로 축약 전
        Function<Integer, String> f1 = (Integer n) -> String.valueOf(n); // 람다 디폴트 표현
        String result1 = f1.apply(2);
        System.out.println(result1);

        // 람다 표현식 메서드 레퍼런스로 축약 전
        Function<Integer, String> f2 = n -> String.valueOf(n);   // 람다 파라미터 축약
        String result2 = f2.apply(2);
        System.out.println(result2);

        // 람다 표현식을 메서드 레퍼런스로 축약
        Function<Integer, String> f3 = String::valueOf;     // 메서드 레퍼런스로 축약
        String result3 = f3.apply(2);
        System.out.println(result3);
    }
}
