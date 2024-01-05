package com.itvillage.section01.class03.practice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itvillage.section01.class03.practice.common.SampleDatasource;

/**
 * 고객이 주문한 커피 정보를 요구 사항에 맞게 JSON 포맷으로 변환하는 예제
 *  - 그룹핑 전 출력
 */
public class StreamPractice0401 {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.println(gson.toJson(SampleDatasource.orderCoffees));
    }
}
