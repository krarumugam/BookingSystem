package com.bookingsystem.demo.dao;

import java.util.List;

import com.bookingsystem.demo.entity.RouteMaster;

public interface RouteMasterDao {
	
	long insert(RouteMaster routeMaster);
	
	RouteMaster find (long routeMasterId);
	
	List<RouteMaster> findAll();

}
