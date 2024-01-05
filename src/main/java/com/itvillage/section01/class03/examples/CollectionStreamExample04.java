package com.itvillage.section01.class03.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Non-streaming 방식. 대용량 데이터를 처리할 때 비효율적인 방식
 */
public class CollectionStreamExample04 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        // 파일 전체 라인을 List에 담는다.
        List<String> list = Files
                .readAllLines(Path.of("C:\\Users\\hjs68\\OneDrive\\project\\itvillage\\mini-project-01\\common-project\\mini-project-p1-preliminary-examples\\src\\main\\java\\com\\itvillage\\section01\\class03\\data.txt"));
        list.forEach(System.out::println);

        long end = System.currentTimeMillis();

        System.out.println("# 작업 시간: " + (end - start));
    }
}

