package com.itvillage.section01.class02;


import com.itvillage.section01.common.Book;

import java.util.function.Function;

/**
 * Class Name::instance method 축약 예제
 */
public class MethodReferenceExample02 {
    public static void main(String[] args) {
        Function<Book, String> f1 = (Book book) -> book.getBookName();  // 람다 파라미터가 어떤 클래스의 인스턴스
        String korName1 = f1.apply(new Book("978-1-234567-89-0", "Advance Java", "Tom", "Tom-boy", 25000, 100));
        System.out.println(korName1);

        Function<Book, String> f2 = book -> book.getBookName();  // 람다 파라미터가 어떤 클래스의 인스턴스
        String korName2 = f2.apply(new Book("978-1-234567-89-0", "Advance Java", "Tom", "Tom-boy", 25000, 100));
        System.out.println(korName2);

        Function<Book, String> f3 = Book::getBookName;       // 클래스 인스턴스 메서드의 축약
        String korName3 = f3.apply(new Book("978-1-234567-89-0", "Advance Java", "Tom", "Tom-boy", 25000, 100));
        System.out.println(korName3);
    }
}
