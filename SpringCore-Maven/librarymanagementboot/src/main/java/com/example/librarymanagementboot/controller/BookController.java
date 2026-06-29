package com.example.librarymanagementboot.controller;

import com.example.librarymanagementboot.entity.Book;
import com.example.librarymanagementboot.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @RequestBody Book newBook) {

        Book book = repository.findById(id).orElse(null);

        if (book != null) {
            book.setTitle(newBook.getTitle());
            book.setAuthor(newBook.getAuthor());
            return repository.save(book);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
        return "Book deleted successfully";
    }
}
