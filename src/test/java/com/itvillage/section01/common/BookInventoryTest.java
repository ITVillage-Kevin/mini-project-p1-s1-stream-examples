package com.itvillage.section01.common;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BookInventoryTest {
    @Test
    public void addStockQuantityTest() {
        BookInventory bookInventory = new BookInventory();
        String testIsbn = "978-1-234567-89-0";
        Book book1 = new Book(
                testIsbn,
                "Advance Java",
                "Tom",
                "Tom-boy",
                25000,
                100);

        Book book2 = new Book(
                testIsbn,
                "Advance Java",
                "Tom",
                "Tom-boy",
                25000,
                200);

        bookInventory.addBookToStock(book1);

        Book bookInStock1 = bookInventory.getBookInStock(testIsbn);

        assertThat(bookInStock1.getQuantity(), is(book1.getQuantity()));

        bookInventory.addBookToStock(book2);
        Book bookInStock2 = bookInventory.getBookInStock(testIsbn);

        assertThat(bookInStock2.getQuantity(),
                is(book1.getQuantity() + book2.getQuantity()));
    }
}
