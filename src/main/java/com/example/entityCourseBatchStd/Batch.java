package com.example.entityCourseBatchStd;

import java.util.Set;

import com.example.entityGallary.Videos;
import com.example.entityPayment.Payment;
import com.example.entityPayment.PaymentMaster;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;



@Entity
public class Batch 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int batch_id;
	private String batchname;
	private LocalTime batch_start_time;
	private LocalTime batch_end_time;
	private boolean batch_is_active = true;
	private LocalDateTime final_presentation_data;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "batch_id")
	private Set<Student> students;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="batch_id" )
	private Set<PaymentMaster> payment_master;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "batch_id")
	private Set<Payment> payments;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="batch_id")
	private List<Videos> videos;


	public int getBatch_id() {
		return batch_id;
	}


	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}


	public String getBatchname() {
		return batchname;
	}


	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}


	public LocalTime getBatch_start_time() {
		return batch_start_time;
	}


	public void setBatch_start_time(LocalTime batch_start_time) {
		this.batch_start_time = batch_start_time;
	}


	public LocalTime getBatch_end_time() {
		return batch_end_time;
	}


	public void setBatch_end_time(LocalTime batch_end_time) {
		this.batch_end_time = batch_end_time;
	}


	public boolean isBatch_is_active() {
		return batch_is_active;
	}


	public void setBatch_is_active(boolean batch_is_active) {
		this.batch_is_active = batch_is_active;
	}


	public LocalDateTime getFinal_presentation_data() {
		return final_presentation_data;
	}


	public void setFinal_presentation_data(LocalDateTime final_presentation_data) {
		this.final_presentation_data = final_presentation_data;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}


	public Set<PaymentMaster> getPayment_master() {
		return payment_master;
	}


	public void setPayment_master(Set<PaymentMaster> payment_master) {
		this.payment_master = payment_master;
	}


	public Set<Payment> getPayments() {
		return payments;
	}


	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}


	public List<Videos> getVideos() {
		return videos;
	}


	public void setVideos(List<Videos> videos) {
		this.videos = videos;
	}

	

	


	
}
