package com.example.repositoryStaffEnquiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entityStaffEnquiry.Enquiry;



public interface EnquiryRepository extends JpaRepository<Enquiry,Integer> {

}
