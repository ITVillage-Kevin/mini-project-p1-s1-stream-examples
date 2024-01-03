package com.itvillage.section01.class01.functional_interface_examples;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

/**
 * 메서드 argument로 전달 하는 람다 표현식의 호출 예제 코드
 */
@Slf4j
public class FunctionalInterfaceExample05 {
    public static void main(String[] args) throws InterruptedException {
        log.info("# start main()");
        String name = "Kevin";
        Supplier<String> supplier = () -> "Hello " + name;
        String message = getMessage(supplier); // 람다 표현식은 지연 호출된다.

        log.info(message);
    }

    // lazily: 람다 표현식은 지연 호출된다.
    private static String getMessage(Supplier<String> s) throws InterruptedException {
        Thread.sleep(5000L);
        return s.get(); // s.get()을 호출하기 전까지는 람다 표현식이 동작을 안한다.
    }

}
