package com.itvillage.section01.class01;

import lombok.extern.slf4j.Slf4j;

/**
 * 메서드 argument로 전달 하는 것처럼 보이는 단순 메서드의 호출 예제 코드
 */
@Slf4j
public class FunctionalInterfaceExample04 {
    public static void main(String[] args) {
        log.info("# start main()");
        String message = getMessage(getName()); // 단순 메서드는 즉시 호출된다.

        log.info(message);
    }

    private static String getMessage(String name) {
        return "Hello " + name;
    }

    // eagerly: getName() 메서드는 즉시 호출된다.
    private static String getName() {
        return "Kevin";
    }
}
