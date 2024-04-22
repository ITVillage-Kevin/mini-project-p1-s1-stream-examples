package com.itvillage.section01.class01;

import java.util.function.Consumer;

/**
 * 익명 구현 클래스는 람다 표현식으로 간결하게 축약할 수 있다.
 */
public class FunctionalInterfaceExample02 {
    public static void main(String[] args) {
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("Hello Functional Interface!");
    }
}
