package com.example.jbdl14restfulapi.repository;

import com.example.jbdl14restfulapi.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {
    Optional<Movie> findByMovieName(String name);
    Optional<Movie> findByGenre(String genre);
}
