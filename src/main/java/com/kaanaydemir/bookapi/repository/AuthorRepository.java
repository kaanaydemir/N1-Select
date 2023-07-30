package com.kaanaydemir.bookapi.repository;

import com.kaanaydemir.bookapi.entity.Author;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a, b FROM Author a JOIN FETCH a.books b")
    List<Author> findAllWithBooksJoinFetch();

    @EntityGraph(value = "Author.books")
    List<Author> findByName(String name);

}
