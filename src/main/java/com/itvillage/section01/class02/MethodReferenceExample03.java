package com.itvillage.section01.class02;


import com.itvillage.section01.common.Book;
import com.itvillage.section01.common.BookInventory;

import java.util.function.Function;

/**
 * 람다 표현식 바깥 쪽의 Class Name::instance method 예제
 */
public class MethodReferenceExample03 {
    public static void main(String[] args) {
        final BookInventory bookInventory = new BookInventory();
        bookInventory.addBookToStock(
                new Book("978-1-234567-89-0",
                        "Advance Java",
                        "Tom",
                        "Tom-boy",
                        25000,
                        100));

        Function<String, Book> f1 = (String isbn) -> bookInventory.getBookInStock(isbn);
        Book book1 = f1.apply("978-1-234567-89-0");
        System.out.println(book1.getBookName());

        Function<String, Book> f2 = isbn -> bookInventory.getBookInStock(isbn);
        Book book2 = f2.apply("978-1-234567-89-0");
        System.out.println(book2.getBookName());

        Function<String, Book> f3 = bookInventory::getBookInStock; // 외부 인스턴스의 메서드를 메서드 레퍼런스로 표현
        Book book3 = f3.apply("978-1-234567-89-0");
        System.out.println(book3.getBookName());
    }
}
