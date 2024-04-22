package com.itvillage.section01.class01;

import java.util.function.Consumer;

/**
 * 람다 표현식은 메서드 레퍼런스로 더 간결하게 축약할 수 있다.
 */
public class FunctionalInterfaceExample03 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello Functional Interface!");
    }
}
