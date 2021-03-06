package com.zensar.service;

import java.time.LocalDate;
import java.util.List;

import com.zensar.bean.TicketBooking;

public interface IBookingService{
	
	public TicketBooking  addBooking(TicketBooking booking,Integer customerId,Integer showId );
	
	public TicketBooking updateBooking(TicketBooking booking);
	
	public TicketBooking cancelBooking(int bookingId);
	
	
	public List<TicketBooking> showAllBookings(int movieId);
	
	public List<TicketBooking> showAllBooking(LocalDate bookingdate);
	
	public List<TicketBooking> showBookingList(int showId);
	
	public double calculateTotalCost(int bookingId);
}
