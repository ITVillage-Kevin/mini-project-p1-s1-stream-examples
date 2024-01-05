package com.itvillage.section01.class03.examples;

import java.util.List;
import java.util.stream.Stream;

/**
 * 탐색 횟수
 */
public class CollectionStreamExample02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum = 0;

        // Collection은 여러번 탐색 가능
        for (int n : list) {
            sum += n;
        }
        for (int n : list) {
            sum += n;
        }

        System.out.println(sum);

        // Stream은 한번만 탐색 가능
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        int total =
                stream
                    .mapToInt(n -> n)
                    .sum();
        total +=
                stream
                    .mapToInt(n -> n)
                    .sum();
        System.out.println(total);
    }
}
