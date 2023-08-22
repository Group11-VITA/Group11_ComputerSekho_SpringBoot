package com.example.controllerStaffEnquiry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entityStaffEnquiry.Enquiry;
import com.example.servicesStaffEnquiry.EnquiryManagerImpl;


@RestController
public class EnquiryController {
	@Autowired
	EnquiryManagerImpl enquirer;
	@GetMapping(value="/getEnquiry")
	public List<Enquiry>get()
	{
		return enquirer.getEnquiry();
	}
	@PostMapping(value="/addEnquiry")
	public void add(@RequestBody Enquiry e)
	{
		enquirer.addEnquiry(e);
	}
}
