package com.kaanaydemir.bookapi.service;

import com.kaanaydemir.bookapi.entity.Author;
import com.kaanaydemir.bookapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public List<Author> getAllAuthorsWithBooks() {
        return authorRepository.findAllWithBooksJoinFetch();
    }

    public List<Author> getAllAuthorsWithBooksEntityGraph() {
        return authorRepository.findByName("J. K. Rowling");
    }
}
