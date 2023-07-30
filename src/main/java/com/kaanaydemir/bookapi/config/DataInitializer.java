package com.kaanaydemir.bookapi.config;

import com.kaanaydemir.bookapi.entity.Author;
import com.kaanaydemir.bookapi.entity.Book;
import com.kaanaydemir.bookapi.repository.AuthorRepository;
import com.kaanaydemir.bookapi.repository.BookRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataInitializer implements ApplicationRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public DataInitializer(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        Author stephenKing = new Author("Stephen King");
        authorRepository.save(stephenKing);

        Book book = new Book("The Shining", stephenKing);
        bookRepository.save(book);

        book = new Book("The Stand", stephenKing);
        bookRepository.save(book);

        book = new Book("The Dead Zone", stephenKing);
        bookRepository.save(book);

        book = new Book("The Dark Tower", stephenKing);
        bookRepository.save(book);

        book = new Book("The Green Mile", stephenKing);
        bookRepository.save(book);

        book = new Book("The Outsider", stephenKing);
        bookRepository.save(book);

        Author tolkien = new Author("J. R. R. Tolkien");
        authorRepository.save(tolkien);

        book = new Book("The Hobbit", tolkien);
        bookRepository.save(book);

        book = new Book("The Lord of the Rings", tolkien);
        bookRepository.save(book);

        book = new Book("The Silmarillion", tolkien);
        bookRepository.save(book);

        Author rowling = new Author("J. K. Rowling");
        authorRepository.save(rowling);

        book = new Book("Harry Potter and the Philosopher's Stone", rowling);
        bookRepository.save(book);

        book = new Book("Harry Potter and the Chamber of Secrets", rowling);
        bookRepository.save(book);

        book = new Book("Harry Potter and the Prisoner of Azkaban", rowling);
        bookRepository.save(book);

        book = new Book("Harry Potter and the Goblet of Fire", rowling);
        bookRepository.save(book);
    }
}
