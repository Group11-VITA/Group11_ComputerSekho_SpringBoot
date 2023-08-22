package com.example.servicesStaffEnquiry;

import java.util.List;

import com.example.entityStaffEnquiry.Enquiry;



public interface EnquiryManager {
	void addEnquiry(Enquiry e1);
	List<Enquiry>getEnquiry();	
}
