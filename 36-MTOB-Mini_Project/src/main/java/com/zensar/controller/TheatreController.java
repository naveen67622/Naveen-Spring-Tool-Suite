package com.zensar.controller;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theatre")
public class TheatreController {
	
	@Id
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private List<MovieController> listOfMovies;
	private List<ScreenController> listOfScreens;
	private String managerName;
	private String managerContact;
	public TheatreController() {
		super();
	}
	public TheatreController(int theatreId, String theatreName, String theatreCity, List<MovieController> listOfMovies,
			List<ScreenController> listOfScreens, String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.listOfMovies = listOfMovies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public List<MovieController> getListOfMovies() {
		return listOfMovies;
	}
	public void setListOfMovies(List<MovieController> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	public List<ScreenController> getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(List<ScreenController> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManageName() {
		return managerName;
	}
	public void setManageName(String manageName) {
		this.managerName = manageName;
	}
	public String getManageContact() {
		return managerContact;
	}
	public void setManageContact(String manageContact) {
		this.managerContact = manageContact;
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", listOfMovies=" + listOfMovies + ", listOfScreens=" + listOfScreens + ", manageName=" + managerName
				+ ", manageContact=" + managerContact + "]";
	}

	
}
