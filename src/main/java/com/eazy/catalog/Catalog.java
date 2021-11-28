package com.eazy.catalog;

import com.eazy.catalog.books.BooksInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class Catalog {

    @Autowired
    BooksInterface booksInterface;

    /* no need for constructor or getter and setters when using autowired annotation */

//    public Catalog(BooksInterface booksInterface) {
//        this.booksInterface = booksInterface;
//    }

    public void showInfo(){
        booksInterface.bookInfo();
    }
}
