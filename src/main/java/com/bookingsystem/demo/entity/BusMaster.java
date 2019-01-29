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
@Table(name = "BUS_MASTER")
@NamedQuery(query = "select bm from BusMaster bm", name = "query_find_all_bm")
public class BusMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bus_master_generator")
	@SequenceGenerator(name = "bus_master_generator", sequenceName = "bus_master_seq")
	@Column(name = "BUS_MASTER_ID", unique = true, nullable = false)
	private Long busMasterId;

	@Column(name = "BUS_NUMBER", unique = true, nullable = false)
	private String busNumber;

	@Column(name = "BUS_TYPE_MASTER_ID")
	private Long busTypeMasterId;

	/*
	 * @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "BUS_TYPE_MASTER_ID") private BusTypeMaster busTypeMaster;
	 * // private List<BusTypeMaster> busTypeMaster;
	 */
	public Long getBusMasterId() {
		return busMasterId;
	}

	public void setBusMasterId(Long busMasterId) {
		this.busMasterId = busMasterId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Long getBusTypeMasterId() {
		return busTypeMasterId;
	}

	public void setBusTypeMasterId(Long busTypeMasterId) {
		this.busTypeMasterId = busTypeMasterId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BusMaster [busMasterId=" + busMasterId + ", busNumber=" + busNumber + ", busTypeMasterId="
				+ busTypeMasterId + "]";
	}

}
