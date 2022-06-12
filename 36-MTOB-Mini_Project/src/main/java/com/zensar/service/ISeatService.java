package com.zensar.service;

import com.zensar.bean.Seat;

public interface ISeatService   {
	 public Seat bookSeat(Seat seat);
	 public Seat cancelSeat(Seat seat);
	 public Seat blockSeat(Seat seat);
	 
}
