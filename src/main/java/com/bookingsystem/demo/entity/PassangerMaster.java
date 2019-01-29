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
@Table(name = "PASSANGER_MASTER")
@NamedQuery(query = "select pm from PassangerMaster pm", name = "query_find_all_pm")
public class PassangerMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passanger_master_generator")
	@SequenceGenerator(name = "passanger_master_generator", sequenceName = "passanger_master_seq")
	@Column(name = "PASSANGER_MASTER_ID", unique = true, nullable = false)
	private Long passangerMasterId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "ID_PROOF", unique = true, nullable = false)
	private String idProof;

	@Column(name = "MAIL_ID", unique = true, nullable = false)
	private String mailId;

	public Long getPassangerMasterId() {
		return passangerMasterId;
	}

	public void setPassangerMasterId(Long passangerMasterId) {
		this.passangerMasterId = passangerMasterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PassangerMaster [passangerMasterId=" + passangerMasterId + ", name=" + name + ", age=" + age
				+ ", idProof=" + idProof + ", mailId=" + mailId + "]";
	}

	/*
	 * @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "PASSANGER_MASTER_ID") private List<BookedTickets>
	 * bookedTickets;
	 */

}
