package com.itvillage.section01.class03.examples;

import java.util.List;
import java.util.stream.Stream;

/**
 * 호출 시점에 따른 데이터 처리 방식. ⭐ 최종 연산을 호출하지 않으면 Stream은 실행되지 않는다.
 */
public class CollectionStreamExample03 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        for (int num : list) {
            System.out.println(num);
        }


        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).filter(n -> n > 2);

        System.out.println("# not processed stream");
        Thread.sleep(5000L);
        System.out.println("# invoke terminal operation");
        stream.forEach(System.out::println); // ⭐ 최종 연산을 호출해야 그때서야 작업 한다. lazy evaluation
    }
}

