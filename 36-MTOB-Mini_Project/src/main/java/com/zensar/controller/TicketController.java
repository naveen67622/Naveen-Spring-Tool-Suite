package com.zensar.controller;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class TicketController {
	@Id
	private int ticketId;
	private int noOfSeats;
	private List<SeatController> seatNumber;
	private TicketBooking  bookingRef;
	private boolean ticketStatus;
	public TicketController() {
		super();
	}
	public TicketController(int ticketId, int noOfSeats, List<SeatController> seatNumber, TicketBooking bookingRef, boolean ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNumber = seatNumber;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public List<SeatController> getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(List<SeatController> seatNumber) {
		this.seatNumber = seatNumber;
	}
	public TicketBooking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatNumber=" + seatNumber
				+ ", bookingRef=" + bookingRef + ", ticketStatus=" + ticketStatus + "]";
	}
	
	
	

}
