package com.bookingsystem.demo.services;

import java.util.List;

import com.bookingsystem.demo.entity.RouteMaster;

public interface RouteMasterServices {

	long insert(RouteMaster routeMaster);

	RouteMaster find(long routeMasterId);

	List<RouteMaster> findAll();

}
