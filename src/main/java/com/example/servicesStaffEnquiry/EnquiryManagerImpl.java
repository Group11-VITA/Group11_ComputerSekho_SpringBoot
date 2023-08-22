package com.example.servicesStaffEnquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityStaffEnquiry.Enquiry;
import com.example.repositoryStaffEnquiry.EnquiryRepository;


@Service
public class EnquiryManagerImpl implements EnquiryManager {
	@Autowired
	EnquiryRepository erepository;
	
	@Override
	public void addEnquiry(Enquiry e1) {
		// TODO Auto-generated method stub
		erepository.save(e1);
	}

	@Override
	public List<Enquiry> getEnquiry() {
		// TODO Auto-generated method stub
		return erepository.findAll();
		
	}

}
