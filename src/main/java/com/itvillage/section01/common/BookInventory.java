package com.itvillage.section01.common;

import java.util.HashMap;
import java.util.Map;

public class BookInventory {
    private Map<String, Book> books = new HashMap<>();

    // 도서 입고
    public void addBookToStock(Book receivedBook) {
        String isbn = receivedBook.getIsbn();
        if (books.containsKey(isbn)) {
            Book book = books.get(isbn);
            book.addQuantity(book.getQuantity() + receivedBook.getQuantity());
        } else {
            books.put(receivedBook.getIsbn(), receivedBook);
        }
    }

    public Book getBookInStock(String isbn) {
        return books.get(isbn);
    }

    public int getAllBooksCountInStock() {
        return books.size();
    }
}
