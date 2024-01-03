package com.itvillage.section01.class01.functional_interface_examples;

import java.util.function.Consumer;

/**
 * - 함수형 인터페이스는 익명 구현 클래스로 작성할 수 있다.
 */
public class FunctionalInterfaceExample01 {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Hello Functional Interface!");
    }
}
