package com.itvillage.section01.class03.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Streaming and Short-circuit 방식
 */
public class CollectionStreamExample06 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 한 라인씩 읽으면서 처리한다.
        Stream<String> lines = Files
                .lines(Path.of("C:\\Users\\hjs68\\OneDrive\\project\\itvillage\\mini-project-01\\common-project\\mini-project-p1-preliminary-examples\\src\\main\\java\\com\\itvillage\\section01\\class03\\data.txt"));
            lines
                .limit(10) // ⭐ Short-circuit: 필요한 데이터만 읽고 데이터 스트림을 끊는다.
                .forEach(System.out::println);

        long end = System.currentTimeMillis();

        System.out.println("# 작업 시간: " + (end - start));
    }
}

