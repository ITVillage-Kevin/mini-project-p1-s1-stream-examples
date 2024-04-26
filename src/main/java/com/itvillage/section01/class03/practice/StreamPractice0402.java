package com.itvillage.section01.class03.practice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itvillage.section01.class03.practice.common.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 고객이 주문한 커피 정보를 요구 사항에 맞게 JSON 포맷으로 변환하는 예제
 *  - 그룹핑 후 출력
 */
public class StreamPractice0402 {
    public static void main(String[] args) {
        Map<OrderCoffeeGroup, List<OrderCoffee>> grouped = groupingByOrderCoffeeGroup(SampleDatasource.orderCoffees);

        List<OrderResponse> response = mappingToResponse(grouped);

        sortingByRecentOrder(response);

        printResponse(response);
    }

    private static Map<OrderCoffeeGroup, List<OrderCoffee>> groupingByOrderCoffeeGroup(List<OrderCoffee> orderCoffees) {
        return orderCoffees.stream()
                .collect(Collectors.groupingBy(OrderCoffeeGroup::new));
    }

    private static List<OrderResponse> mappingToResponse(Map<OrderCoffeeGroup, List<OrderCoffee>> grouped) {
        return grouped.entrySet().stream()
                .map(e -> {
                    OrderCoffeeGroup group = e.getKey();
                    List<OrderCoffee> orderCoffees = e.getValue();
                    OrderResponse orderResponse = new OrderResponse();
                    orderResponse.setOrderId(group.getOrderId());
                    orderResponse.setUserId(group.getUserId());
                    orderResponse.setCreatedAt(group.getCreatedAt());

                    List<OrderCoffeeResponse> orderCoffeeResponses =
                            orderCoffees.stream()
                                    .map(orderCoffee ->
                                            new OrderCoffeeResponse(orderCoffee.getCoffeeId(),
                                                orderCoffee.getKorName(),
                                                orderCoffee.getEngName(),
                                                orderCoffee.getPrice(),
                                                orderCoffee.getQuantity()))
                                    .collect(Collectors.toList());
                    orderResponse.setOrderCoffees(orderCoffeeResponses);

                    return orderResponse;
                }).collect(Collectors.toList());
    }

    private static void sortingByRecentOrder(List<OrderResponse> response) {
        response.sort(Comparator.comparing(OrderResponse::getOrderId).reversed());
    }

    private static void printResponse(List<OrderResponse> response) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        System.out.println(gson.toJson(response));
    }
}
