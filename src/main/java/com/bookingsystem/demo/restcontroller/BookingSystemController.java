package com.bookingsystem.demo.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookingsystem.demo.entity.BusMaster;
import com.bookingsystem.demo.entity.BusTypeMaster;
import com.bookingsystem.demo.entity.PassangerMaster;
import com.bookingsystem.demo.entity.RouteMaster;
import com.bookingsystem.demo.entity.StopMaster;
import com.bookingsystem.demo.entity.TripFare;
import com.bookingsystem.demo.services.BusMasterServices;
import com.bookingsystem.demo.services.BusTypeMasterServices;
import com.bookingsystem.demo.services.PassangerMasterServices;
import com.bookingsystem.demo.services.RouteMasterServices;
import com.bookingsystem.demo.services.StopMasterServices;
import com.bookingsystem.demo.services.TripFareServices;

@RestController
public class BookingSystemController {
	@Value("${spring.application.name}")
	private String appname;

	@Autowired
	BusTypeMasterServices busTypeMasterServices;

	@Autowired
	BusMasterServices busMasterServices;

	@Autowired
	PassangerMasterServices passangerMasterServices;

	@Autowired
	RouteMasterServices routeMasterServices;

	@Autowired
	StopMasterServices stopMasterServices;
	
	@Autowired
	TripFareServices tripFareServices;

	@RequestMapping(value = "/")
	public String hello() {
		// return "Hello World";
		return appname;
	}

	/*
	 * Request for Bus Mater Type
	 * -----------------------------------------------------------------------------
	 * ----
	 */
	@PostMapping("/busTypeMaster")
	public long createBusTypeMaster(@Valid @RequestBody BusTypeMaster busTypeMaster) {
		System.out.println("enter");
		System.out.println("enter " + busTypeMaster.getBusType());
		return busTypeMasterServices.insert(busTypeMaster);
	}

	@RequestMapping(value = { "/getBusTypeMaster/{busTypeMasterId}" }, method = RequestMethod.GET)
	public BusTypeMaster getBusTypeMaster(@PathVariable long busTypeMasterId) {
		System.out.println("enter");
		return busTypeMasterServices.find(busTypeMasterId);
	}

	@RequestMapping(value = { "/getAllBusTypeMaster" }, method = RequestMethod.GET)
	public ResponseEntity<List<BusTypeMaster>> findAllBusMasterType() {
		System.out.println("entered");
		List<BusTypeMaster> busTypeMaster = busTypeMasterServices.findAll();
		return new ResponseEntity<List<BusTypeMaster>>(busTypeMaster, HttpStatus.OK);
	}

	/*
	 * Request for Bus Master
	 * -----------------------------------------------------------------------------
	 * -----------
	 */
	@PostMapping("/busMaster")
	public long createBusMaster(@Valid @RequestBody BusMaster busMaster) {
		System.out.println("enter");
		System.out.println("enter " + busMaster.getBusNumber());
		return busMasterServices.insert(busMaster);
	}

	@RequestMapping(value = { "/getBusMaster/{busMasterId}" }, method = RequestMethod.GET)
	public BusMaster getBusMaster(@PathVariable long busMasterId) {
		System.out.println("enter");
		return busMasterServices.find(busMasterId);
	}

	@RequestMapping(value = { "/getAllBusMaster" }, method = RequestMethod.GET)
	public ResponseEntity<List<BusMaster>> findAllBusMaster() {
		System.out.println("entered");
		List<BusMaster> busMaster = busMasterServices.findAll();
		return new ResponseEntity<List<BusMaster>>(busMaster, HttpStatus.OK);
	}

	/*
	 * Request for Passanger Master
	 * -----------------------------------------------------------------------------
	 * -----------
	 */
	@PostMapping("/passangerMaster")
	public long createPassangerMaster(@Valid @RequestBody PassangerMaster passangerMaster) {
		System.out.println("enter passangerMaster");
		System.out.println("enter " + passangerMaster.getIdProof());
		return passangerMasterServices.insert(passangerMaster);
	}

	@RequestMapping(value = { "/getPassangerMaster/{passangerMasterId}" }, method = RequestMethod.GET)
	public PassangerMaster getPassangerMaster(@PathVariable long passangerMasterId) {
		System.out.println("enter getPassangerMaster");
		return passangerMasterServices.find(passangerMasterId);
	}

	@RequestMapping(value = { "/getAllPassangerMaster" }, method = RequestMethod.GET)
	public ResponseEntity<List<PassangerMaster>> findAllPassangerMaster() {
		System.out.println("entered getAllPassangerMaster");
		List<PassangerMaster> passangerMaster = passangerMasterServices.findAll();
		return new ResponseEntity<List<PassangerMaster>>(passangerMaster, HttpStatus.OK);
	}

	/*
	 * Request for Route Master
	 * -----------------------------------------------------------------------------
	 * -----------
	 */
	@PostMapping("/routeMaster")
	public long createRouteMaster(@Valid @RequestBody RouteMaster routeMaster) {
		System.out.println("enter routeMaster");
		System.out.println("enter " + routeMaster.getRouteMasterId());
		return routeMasterServices.insert(routeMaster);
	}

	@RequestMapping(value = { "/getRouteMaster/{routeMasterId}" }, method = RequestMethod.GET)
	public RouteMaster getRouteMaster(@PathVariable long routeMasterId) {
		System.out.println("enter getRouteMaster");
		return routeMasterServices.find(routeMasterId);
	}

	@RequestMapping(value = { "/getAllRouteMaster" }, method = RequestMethod.GET)
	public ResponseEntity<List<RouteMaster>> findAllRouteMaster() {
		System.out.println("entered getAllRouteMaster");
		List<RouteMaster> routeMaster = routeMasterServices.findAll();
		return new ResponseEntity<List<RouteMaster>>(routeMaster, HttpStatus.OK);
	}

	/*
	 * Request for Stop Master
	 * -----------------------------------------------------------------------------
	 * -----------
	 */
	@PostMapping("/stopMaster")
	public long createStopMaster(@Valid @RequestBody StopMaster stopMaster) {
		System.out.println("enter stopMaster");
		System.out.println("enter " + stopMaster.getRouteMasterId());
		return stopMasterServices.insert(stopMaster);
	}

	@RequestMapping(value = { "/getStopMaster/{stopMasterId}" }, method = RequestMethod.GET)
	public StopMaster getStopMaster(@PathVariable long stopMasterId) {
		System.out.println("enter getStopMaster");
		return stopMasterServices.find(stopMasterId);
	}

	@RequestMapping(value = { "/getAllStopMaster" }, method = RequestMethod.GET)
	public ResponseEntity<List<StopMaster>> findAllStopMaster() {
		System.out.println("entered getAllStopMaster");
		List<StopMaster> stopMaster = stopMasterServices.findAll();
		return new ResponseEntity<List<StopMaster>>(stopMaster, HttpStatus.OK);
	}
	
	/*
	 * Request for Trip Fare
	 * -----------------------------------------------------------------------------
	 * -----------
	 */
	@PostMapping("/tripFare")
	public long createTripFare(@Valid @RequestBody TripFare tripFare) {
		System.out.println("enter TripFare");
		System.out.println("enter " + tripFare.getTripFareId());
		return tripFareServices.insert(tripFare);
	}

	@RequestMapping(value = { "/getTripFare/{tripFareId}" }, method = RequestMethod.GET)
	public TripFare getTripFare(@PathVariable long tripFareId) {
		System.out.println("enter getTripFare");
		return tripFareServices.find(tripFareId);
	}

	@RequestMapping(value = { "/getAllTripFare" }, method = RequestMethod.GET)
	public ResponseEntity<List<TripFare>> findAllTripFare() {
		System.out.println("entered getAllTripFare");
		List<TripFare> tripFare = tripFareServices.findAll();
		return new ResponseEntity<List<TripFare>>(tripFare, HttpStatus.OK);
	}

}
