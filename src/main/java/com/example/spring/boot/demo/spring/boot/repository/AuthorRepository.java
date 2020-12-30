package com.example.spring.boot.demo.spring.boot.repository;

import com.example.spring.boot.demo.spring.boot.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {



}
