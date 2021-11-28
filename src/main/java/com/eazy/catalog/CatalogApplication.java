package com.eazy.catalog;

import com.eazy.catalog.books.BooksInterface;
import com.eazy.catalog.books.GoodNews;
import com.eazy.catalog.books.PlayBoy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CatalogApplication {

    public static void main(String[] args) {
//         SpringApplication.run(CatalogApplication.class, args);

//        Catalog catalog = new Catalog(new PlayBoy());
//        catalog.showInfo();

        ApplicationContext context = SpringApplication.run(CatalogApplication.class, args);

//        BooksInterface booksInterface = context.getBean(PlayBoy.class);
//        booksInterface.bookInfo();

        GoodNews bean = context.getBean(GoodNews.class);
        bean.bookInfo();
    }

}
