package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Movie;

@Repository
public interface IMovieRepository  extends JpaRepository<Movie, Integer>{

}
