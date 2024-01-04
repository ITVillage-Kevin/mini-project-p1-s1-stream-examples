package com.itvillage.section01.class02;


import com.itvillage.section01.common.BookInventory;

import java.util.function.Supplier;

/**
 * Constructor::new 예제
 */
public class MethodReferenceExample04 {
    public static void main(String[] args) {
        Supplier<BookInventory> f1 = () -> new BookInventory();
        final BookInventory bookInventory1 = f1.get();
        System.out.println(bookInventory1.getAllBooksCountInStock());


        Supplier<BookInventory> f2 = BookInventory::new;
        final BookInventory bookInventory2 = f2.get();
        System.out.println(bookInventory2.getAllBooksCountInStock());
    }
}
