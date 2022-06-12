package com.zensar.service;

import java.time.LocalDate;
import java.util.List;

import com.zensar.bean.Movie;

public interface IMovieService  {
	public Movie addMovie(Movie movie);
	public Movie updateMovie(Movie movie);
	public Movie removeMovie(Movie movie);
	public Movie viewMovie(int movieId);
	public  List<Movie>  viewMoviesList(int theatreId);
	public List<Movie> viewLit(LocalDate date);
	
	
	

}
