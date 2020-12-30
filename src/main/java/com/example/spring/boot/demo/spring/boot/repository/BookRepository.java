package com.example.spring.boot.demo.spring.boot.repository;

import com.example.spring.boot.demo.spring.boot.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
