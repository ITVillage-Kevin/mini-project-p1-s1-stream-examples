package com.itvillage.section01.class01;

import java.util.HashMap;
import java.util.Map;

/**
 * JWT Refresh 토큰을 검증하는 시뮬레이션 예제 코드
 * - 람다 표현식을 사용하지 않는 경우
 *      - 람다 표현식을 사용하지 않을 경우, if문 같은 코드가 늘어난다.
 */
public class FunctionalInterfaceExample06 {
    private static boolean enableRedis = true;
    private static String username = "kevin";
    private static Map<String, String> map = new HashMap<>(); // Redis 역할
    static {
        map.put("kevin", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IHJlZnJlc2ggdG9rZW4iLCJpYXQiOjE2NzI3NTAwMjYsImV4cCI6MTY3MjgzNjQyNn0.xXu57y2uTWWw8GwPpLhTTWJs8xAM0oWC3FeRWncryJ4");
    }

    public static void main(String[] args) {
        // 클라이언트로부터 전달 받은 토큰이라고 가정한다.
        String refreshToken = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IHJlZnJlc2ggdG9rZW4iLCJpYXQiOjE2NzI3NTAwMjYsImV4cCI6MTY3MjgzNjQyNn0.xXu57y2uTWWw8GwPpLhTTWJs8xAM0oWC3FeRWncryJ4";

        verifyRefreshToken(refreshToken);
    }

    // 토근 검증
    private static void verifyRefreshToken(String refreshToken) {
        if (enableRedis) {
            String refreshTokenFromDb = getRefreshTokenFromDb(username);
            if (!refreshToken.equals(refreshTokenFromDb) || expiredToken(refreshToken)) {
                throw new RuntimeException("Invalid Token");
            }
        } else {
            if (expiredToken(refreshToken)) {
                throw new RuntimeException("Invalid Token");
            }
        }
    }

    private static boolean expiredToken(String refreshToken) {
        return false;
    }

    private static String getRefreshTokenFromDb(String username) {
        return map.get(username);
    }

}
