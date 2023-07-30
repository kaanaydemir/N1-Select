package com.kaanaydemir.bookapi.controller;

import com.kaanaydemir.bookapi.entity.Author;
import com.kaanaydemir.bookapi.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @GetMapping("/with-books")
    public ResponseEntity<List<Author>> getAllAuthorsWithBooks() {
        return ResponseEntity.ok(authorService.getAllAuthorsWithBooks());
    }

    @GetMapping("/with-books-entity-graph")
    public ResponseEntity<List<Author>> getAllAuthorsWithBooksEntityGraph() {
        return ResponseEntity.ok(authorService.getAllAuthorsWithBooksEntityGraph());
    }
}
