package com.eazy.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CatalogApplicationTest {

    ApplicationContext context = SpringApplication.run(CatalogApplication.class);

    Catalog catalog = context.getBean("catalog", Catalog.class);
    
}