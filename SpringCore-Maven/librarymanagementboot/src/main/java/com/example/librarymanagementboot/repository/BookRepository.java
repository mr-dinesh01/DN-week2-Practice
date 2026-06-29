package com.example.librarymanagementboot.repository;

import com.example.librarymanagementboot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}

