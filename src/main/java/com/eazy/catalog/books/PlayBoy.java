package com.eazy.catalog.books;


import org.springframework.stereotype.Component;

@Component
public class PlayBoy implements BooksInterface{
    @Override
    public void bookInfo() {
        System.out.println("A nice magazine");
    }
}
