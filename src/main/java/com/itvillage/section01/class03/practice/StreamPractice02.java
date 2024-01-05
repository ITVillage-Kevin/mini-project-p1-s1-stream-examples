package com.itvillage.section01.class03.practice;

import java.util.stream.LongStream;

// parallel()을 이용해 1부터 400억의 누적 합계를 계산하는 예제
public class StreamPractice02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = LongStream.rangeClosed(1L, 40_000_000_000L)
                .parallel()
                .sum();

        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("# 작업 시간: " + (end - start));
    }
}
