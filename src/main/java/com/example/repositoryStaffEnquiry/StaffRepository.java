package com.example.repositoryStaffEnquiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entityStaffEnquiry.Staff;

import jakarta.transaction.Transactional;

//@Repository
//@Transactional
public interface StaffRepository extends JpaRepository<Staff,Integer>{
	 
	}

