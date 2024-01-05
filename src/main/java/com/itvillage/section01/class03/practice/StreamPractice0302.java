package com.itvillage.section01.class03.practice;

import java.util.Collection;
import java.util.stream.Stream;

import static com.itvillage.section01.class03.practice.common.SampleDatasource.*;

/**
 * flatMap()을 이용해 세 개 베이커리 지점의 매출을 합산해서 전체 매출액을 계산하는 예제
 */
public class StreamPractice0302 {
    public static void main(String[] args) {
        Integer total =
                Stream.of(salesOfBakeryA, salesOfBakeryB, salesOfBakeryC)
                        .flatMap(Collection::stream)
                        .mapToInt(Integer::intValue).sum();

        System.out.println("# 전체 매출액: " + total);
    }
}
