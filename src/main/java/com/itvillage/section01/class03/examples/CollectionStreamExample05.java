package com.itvillage.section01.class03.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Streaming 방식. ⭐ 대용량 데이터를 처리할 때 효율적인 방식
 */
public class CollectionStreamExample05 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // ⭐ 한 라인씩 읽으면서 처리한다.
        Stream<String> lines = Files
//                .lines(Path.of("src/main/resources/data.txt"));
                .lines(Path.of("src/main/resources/big_size_data.txt"));
            lines.forEach(line -> {});

        long end = System.currentTimeMillis();

        System.out.println("# 작업 시간: " + (end - start));
    }
}

