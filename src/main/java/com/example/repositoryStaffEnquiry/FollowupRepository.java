package com.example.repositoryStaffEnquiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entityStaffEnquiry.Followup;



public interface FollowupRepository extends JpaRepository<Followup, Integer> {

}
