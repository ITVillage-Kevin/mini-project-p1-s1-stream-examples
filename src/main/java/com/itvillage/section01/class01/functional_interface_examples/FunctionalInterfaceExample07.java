package com.itvillage.section01.class01.functional_interface_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * JWT Refresh 토큰을 검증하는 시뮬레이션 예제
 * - 람다 표현식을 사용하는 경우
 *      - 조건에 해당하는 조건문(변하는 내용)만 람다 표현식으로 넘기고, 나머지는 공통화 할 수 있다.
 */
public class FunctionalInterfaceExample07 {
    private static boolean enableRedis = true;
    private static String username = "kevin";
    private static Map<String, String> map = new HashMap<>();  // Redis 역할
    static {
        map.put("kevin", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IHJlZnJlc2ggdG9rZW4iLCJpYXQiOjE2NzI3NTAwMjYsImV4cCI6MTY3MjgzNjQyNn0.xXu57y2uTWWw8GwPpLhTTWJs8xAM0oWC3FeRWncryJ4");
    }

    public static void main(String[] args) {
        // 클라이언트로부터 전달 받은 토큰이라고 가정한다.
        String refreshToken = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IHJlZnJlc2ggdG9rZW4iLCJpYXQiOjE2NzI3NTAwMjYsImV4cCI6MTY3MjgzNjQyNn0.xXu57y2uTWWw8GwPpLhTTWJs8xAM0oWC3FeRWncryJ4";
        Predicate<String> verifyCondition = (String rToken) -> expiredToken(refreshToken);

        if (enableRedis) {
            String refreshTokenFromDb = getRefreshTokenFromDb(username);
            verifyCondition = (String rToken) -> !rToken.equals(refreshTokenFromDb) || expiredToken(rToken);
        }

        verifyRefreshToken(refreshToken, verifyCondition);
    }

    // 토근 검증
    private static void verifyRefreshToken(String refreshToken, Predicate<String> predicate) {
        if(predicate.test(refreshToken))
            throw  new RuntimeException("Invalid Token");
    }

    private static boolean expiredToken(String refreshToken) {
        return false;
    }

    private static String getRefreshTokenFromDb(String username) {
        return map.get(username);
    }

}
