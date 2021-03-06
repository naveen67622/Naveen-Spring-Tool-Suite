package com.zensar.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Customer;
import com.zensar.bean.Seat;
import com.zensar.bean.Ticket;
import com.zensar.bean.TicketBooking;
import com.zensar.repository.IBookingRepository;
import com.zensar.repository.ICustomerRepository;
import com.zensar.repository.IMovieRepository;
import com.zensar.repository.ISeatRepository;
import com.zensar.repository.IShowRepository;
import com.zensar.repository.IUserRepository;

@Service
public class IBookingServiceImpl implements IBookingService   {
	

	@Autowired
	private IBookingRepository IBookingRepository;
	
	@Autowired
	private ICustomerRepository ICustomerRepository;
	
	@Autowired
	private IMovieRepository IMovieRepository;
	
	@Autowired
	private ISeatRepository  ISeatRepositiry;
	
	@Autowired
	private IShowRepository IShowRepository;
	
	@Autowired
	private IUserRepository IUserRepository;
	
	@Override
	public TicketBooking addBooking(TicketBooking booking, Integer customerId, Integer showId) {
		Customer customer = new Customer();
		if(showId!=null) {
			showId=showTicketBookingRepository.findById(showId).get();
			showId.setBooking(booking);
			booking.setShowId(showId);
			
		}
		bookingRepository.saveAndFlush(booking);
		showRepository.saveAndFlush(showId);
		return bookingRepository.findById(booking.getTransactionId()).get();
	}

	@Override
	public TicketBooking updateBooking(TicketBooking booking) {
		bookingRepository.saveAndFlush(showId);
		return bookingRepository.getOne(booking.getTransactionId());
	}

	@Override
	public TicketBooking cancelBooking(int bookingId) {
		TicketBooking b=bookingRepository.getOne(bookingId);
		return b;
	}

	@Override
	public List<TicketBooking> showAllBookings(int movieId) {
		List<TicketBooking> bk= query.getAllByMovieId(movieId);
		return bk;
	}

	@Override
	public List<TicketBooking> showAllBooking(LocalDate bookingdate) {
		List<TicketBooking> bkList= new ArrayList<>();
		for(TicketBooking booking : bookingRepository.findAll()) {
			if(booking.getBookingDate() !=null && booking.getBookingDate().isEqual(bookingdate)) {
			bkList.add(booking);
		}
		}
		return bkList;
	}

	@Override
	public List<TicketBooking> showBookingList(int showId) {
		List<TicketBooking> bk =bookingRepository.findAll();
		
		return bk;
	}

	@Override
	public double calculateTotalCost(int bookingId) {
		List<Ticket> tickets =ticketRepository.findAll();
		Set<Seat> Seats = new HashSet<>();
		for(Ticket ticket  : tickets) {
			if(Ticketbookingid == ticket.getBookingRef().getTransactionId()) {
				Seats.addAll(ticket.getSeats());
			}
		}
		double amount =0;
		for(Seat seat : Seats) {
			amount = amount + seat.getPrice();	
		}
		TicketBooking booking = bookingRepository.getOne(bookingId);
		booking.setTotalCost(amount);
		bookingRepository.saveAndFlush(booking);
		return amount;
		
	}
	
	

}
