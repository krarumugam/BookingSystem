package com.bookingsystem.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TRIP_FARE")
@NamedQuery(query = "select tf from TripFare tf", name = "query_find_all_tf")
public class TripFare implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trip_fare_generator")
	@SequenceGenerator(name = "trip_fare_generator", sequenceName = "trip_fare_seq")
	@Column(name = "TRIP_FARE_ID", unique = true, nullable = false)
	private Long tripFareId;

	@Column(name = "BUS_MASTER_ID", nullable = false)
	private int busMaster_id;

	@Column(name = "BUS_NUMBER", nullable = false)
	private String busNumber;

	@Column(name = "FARE_PER_KM", nullable = false)
	private int farePerkm;

	public Long getTripFareId() {
		return tripFareId;
	}

	public void setTripFareId(Long tripFareId) {
		this.tripFareId = tripFareId;
	}

	public int getBusMaster_id() {
		return busMaster_id;
	}

	public void setBusMaster_id(int busMaster_id) {
		this.busMaster_id = busMaster_id;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public int getFarePerkm() {
		return farePerkm;
	}

	public void setFarePerkm(int farePerkm) {
		this.farePerkm = farePerkm;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TripFare [tripFareId=" + tripFareId + ", busMaster_id=" + busMaster_id + ", busNumber=" + busNumber
				+ ", farePerkm=" + farePerkm + "]";
	}

}
