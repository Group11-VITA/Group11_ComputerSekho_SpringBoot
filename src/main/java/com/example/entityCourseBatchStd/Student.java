package com.example.entityCourseBatchStd;

import java.util.*;

import com.example.entityPayment.Payment;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_id;
	private String student_name;
	private String student_address;
	private String student_gender;
	private String photo_url;
	private Date student_dob;
	private String studnet_qualification;
	private String student_mobile;
	private String student_passsword;
	private String student_username;
	private double course_fees;

//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="student_id", referencedColumnName = "student_id" )
//	private Set<PaymentMaster> payment_master;

	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "student_id" , referencedColumnName = "student_id")
	private Set<Payment> payments;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Set<PaymentMaster> getPayment_master() {
//		return payment_master;
//	}
//
//	public void setPayment_master(Set<PaymentMaster> payment_master) {
//		this.payment_master = payment_master;
//	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public Date getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}

	public String getStudnet_qualification() {
		return studnet_qualification;
	}

	public void setStudnet_qualification(String studnet_qualification) {
		this.studnet_qualification = studnet_qualification;
	}

	public String getStudent_mobile() {
		return student_mobile;
	}

	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}

	public String getStudent_passsword() {
		return student_passsword;
	}

	public void setStudent_passsword(String student_passsword) {
		this.student_passsword = student_passsword;
	}

	public String getStudent_username() {
		return student_username;
	}

	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}

	
	public double getCourse_fees() {
		return course_fees;
	}

	public void setCourse_fees(double course_fees) {
		this.course_fees = course_fees;
	}
	

}
