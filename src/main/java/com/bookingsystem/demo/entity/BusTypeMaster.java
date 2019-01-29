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
@Table(name = "BUS_TYPE_MASTER")
@NamedQuery(query = "select btm from BusTypeMaster btm", name = "query_find_all_btm")
public class BusTypeMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bus_type_master_generator")
	@SequenceGenerator(name = "bus_type_master_generator", sequenceName = "bus_type_master_seq")
	@Column(name = "BUS_TYPE_MASTER_ID", unique = true, nullable = false)
	private Long busTypeMasterId;

	@Column(name = "BUS_TYPE")
	private String busType;

	@Column(name = "BUS_CLASS")
	private String busClass;

	@Column(name = "NO_OF_SEATS")
	private int noOfSeats;

	@Column(name = "SEATER_SLEEPER")
	private String seaterSleeper;

	@Column(name = "IS_AC")
	private boolean isAc;

	public Long getBusTypeMasterId() {
		return busTypeMasterId;
	}

	public void setBusTypeMasterId(Long busTypeMasterId) {
		this.busTypeMasterId = busTypeMasterId;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBusClass() {
		return busClass;
	}

	public void setBusClass(String busClass) {
		this.busClass = busClass;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getSeaterSleeper() {
		return seaterSleeper;
	}

	public void setSeaterSleeper(String seaterSleeper) {
		this.seaterSleeper = seaterSleeper;
	}

	public boolean getIsAc() {
		return isAc;
	}

	public void setIsAc(boolean isAc) {
		this.isAc = isAc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BusTypeMaster [busTypeMasterId=" + busTypeMasterId + ", busType=" + busType + ", busClass=" + busClass
				+ ", noOfSeats=" + noOfSeats + ", seaterSleeper=" + seaterSleeper + ", isAc=" + isAc + "]";
	}

	/*
	 * @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "BUS_TYPE_MASTER_ID") private List<BusMaster> busMaster;
	 */

	
}