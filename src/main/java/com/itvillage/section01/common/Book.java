package com.itvillage.section01.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private String isbn;
    private String bookName;
    private String authorName;
    private String penName;
    private int price;
    private int quantity;

    public void addQuantity(int quantity) {
        this.quantity = quantity;
    }
}
