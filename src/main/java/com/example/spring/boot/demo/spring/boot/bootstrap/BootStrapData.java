package com.example.spring.boot.demo.spring.boot.bootstrap;

import com.example.spring.boot.demo.spring.boot.domain.Author;
import com.example.spring.boot.demo.spring.boot.domain.Book;
import com.example.spring.boot.demo.spring.boot.repository.AuthorRepository;
import com.example.spring.boot.demo.spring.boot.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book dddd =new Book("domain driven design","12345");
        eric.getBooks().add(dddd);
        dddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(dddd);
        Author tulsiDas = new Author("tulsi","das");
        Book ramayna =new Book("ramayna","1008");
        tulsiDas.getBooks().add(ramayna);
        ramayna.getAuthors().add(tulsiDas);

        authorRepository.save(tulsiDas);
        bookRepository.save(ramayna);

        System.out.println("Authors "+authorRepository.count());
        System.out.println("Books "+bookRepository.count());


    }
}
