package com.bookingsystem.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKED_TICKET")
public class BookedTickets implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booked_ticket_generator")
	@SequenceGenerator(name = "booked_ticket_generator", sequenceName = "booked_ticket_seq")
	@Column(name = "BOOKED_TICKET_ID", unique = true, nullable = false)
	private Long bookedTicketId;

	@Column(name = "BUS_MASTER_ID", nullable = false)
	private Long busMasterid;

	@Column(name = "BUS_NUMBER", nullable = false)
	private String busNumber;

	@Column(name = "DATE_OF_JOURNY", nullable = false)
	private Date dateOfJourny;

	@Column(name = "PASSANGER_MASTER_ID", nullable = false)
	private Long passangerMasterId;

	@Column(name = "SEAT_NO", nullable = false)
	private Long seatNo;

	@Column(name = "GENDER", nullable = false)
	private String gender;

	@Column(name = "TOTAL_AMOUNT")
	private Long totalAmount;

	@Column(name = "IS_CANCELLED")
	private boolean isCancelled;

	@Column(name = "CANCELLATION_DATE")
	private Date cancellationDate;

	public Long getBookedTicketId() {
		return bookedTicketId;
	}

	public void setBookedTicketId(Long bookedTicketId) {
		this.bookedTicketId = bookedTicketId;
	}

	public Long getBusMasterid() {
		return busMasterid;
	}

	public void setBusMasterid(Long busMasterid) {
		this.busMasterid = busMasterid;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Date getDateOfJourny() {
		return dateOfJourny;
	}

	public void setDateOfJourny(Date dateOfJourny) {
		this.dateOfJourny = dateOfJourny;
	}

	public Long getPassangerMasterId() {
		return passangerMasterId;
	}

	public void setPassangerMasterId(Long passangerMasterId) {
		this.passangerMasterId = passangerMasterId;
	}

	public Long getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Long seatNo) {
		this.seatNo = seatNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean isCancelled() {
		return isCancelled;
	}

	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public Date getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BookedTickets [bookedTicketId=" + bookedTicketId + ", busMasterid=" + busMasterid + ", busNumber="
				+ busNumber + ", dateOfJourny=" + dateOfJourny + ", passangerMasterId=" + passangerMasterId
				+ ", seatNo=" + seatNo + ", gender=" + gender + ", totalAmount=" + totalAmount + ", isCancelled="
				+ isCancelled + ", cancellationDate=" + cancellationDate + "]";
	}

}
