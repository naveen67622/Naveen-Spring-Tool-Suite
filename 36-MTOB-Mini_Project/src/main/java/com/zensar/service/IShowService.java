package com.zensar.service;

import java.time.LocalDate;
import java.util.List;

import com.zensar.bean.Show;

public interface IShowService  {
	public Show addShow(Show show,Integer theatreId, Integer screenId);
	public Show updateShow(Show show,Integer theatreId, Integer screenId);
	public Show removeShow(int showId);
	public Show viewShow();
	public List<Show> viewShowList(int theatreId);
	public List<Show> viewShowList(LocalDate date);
	public List<Show> viewAllShows();
	
	

}
