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
@Table(name = "STOP_MASTER")
@NamedQuery(query = "select stm from StopMaster stm", name = "query_find_all_stm")
public class StopMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stop_master_generator")
	@SequenceGenerator(name = "stop_master_generator", sequenceName = "stop_master_seq")
	@Column(name = "STOP_MASTER_ID", unique = true, nullable = false)
	private Long stopMasterId;

	@Column(name = "ROUTE_MASTER_ID", nullable = false)
	private int routeMasterId;

	@Column(name = "STOP_NAME", nullable = false)
	private String stopName;

	@Column(name = "KMS_FROM_ORGIN", nullable = false)
	private int kmsFromOrgin;

	public Long getStopMasterId() {
		return stopMasterId;
	}

	public void setStopMasterId(Long stopMasterId) {
		this.stopMasterId = stopMasterId;
	}

	public int getRouteMasterId() {
		return routeMasterId;
	}

	public void setRouteMasterId(int routeMasterId) {
		this.routeMasterId = routeMasterId;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public int getKmsFromOrgin() {
		return kmsFromOrgin;
	}

	public void setKmsFromOrgin(int kmsFromOrgin) {
		this.kmsFromOrgin = kmsFromOrgin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StopMaster [stopMasterId=" + stopMasterId + ", routeMasterId=" + routeMasterId + ", stopName="
				+ stopName + ", kmsFromOrgin=" + kmsFromOrgin + "]";
	}

}
