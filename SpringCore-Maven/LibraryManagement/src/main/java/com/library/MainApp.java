package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {

        // Load the Spring container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookRepository bean
        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        // Get the BookService bean
        BookService service =
                context.getBean("bookService", BookService.class);

        // Call methods
        repository.display();
        service.display();
    }
}