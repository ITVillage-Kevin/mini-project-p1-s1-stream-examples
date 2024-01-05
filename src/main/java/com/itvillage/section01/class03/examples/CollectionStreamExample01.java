package com.itvillage.section01.class03.examples;

import java.util.List;
import java.util.stream.Stream;

/**
 * 반복 방식
 */
public class CollectionStreamExample01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum = 0;

        // Collection은 외부 반복
        for (int n : list) {
            sum += n;
        }
        System.out.println(sum);

        // Stream은 내부 반복
        int total = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(n -> n)
                .sum();
        System.out.println(total);
    }
}
