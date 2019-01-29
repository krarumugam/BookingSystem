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
@Table(name = "ROUTE_MASTER")
@NamedQuery(query = "select rtm from RouteMaster rtm", name = "query_find_all_rtm")
public class RouteMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "route_master_generator")
	@SequenceGenerator(name = "route_master_generator", sequenceName = "route_master_seq")
	@Column(name = "ROUTE_MASTER_ID", unique = true, nullable = false)
	private Long routeMasterId;

	@Column(name = "BUS_NUMBER", nullable = false)
	private String busNumber;

	@Column(name = "ORIGIN", nullable = false)
	private String origin;

	@Column(name = "DESTINATION", nullable = false)
	private String destination;

	@Column(name = "TOTAL_DISTANCE", nullable = false)
	private int totalDistance;

	public Long getRouteMasterId() {
		return routeMasterId;
	}

	public void setRouteMasterId(Long routeMasterId) {
		this.routeMasterId = routeMasterId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RouteMaster [routeMasterId=" + routeMasterId + ", busNumber=" + busNumber + ", origin=" + origin
				+ ", destination=" + destination + ", totalDistance=" + totalDistance + "]";
	}

	/*
	 * @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "ROUTE_MASTER_ID") private List<StopMaster> stopMaster;
	 */

}
