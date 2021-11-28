package com.eazy.catalog.books;


import org.springframework.stereotype.Component;

@Component
public class GoodNews implements BooksInterface{
    @Override
    public void bookInfo() {
        System.out.println("Good News Bible");
    }
}
