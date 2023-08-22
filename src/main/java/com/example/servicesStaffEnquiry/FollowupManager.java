package com.example.servicesStaffEnquiry;

import java.util.List;

import com.example.entityStaffEnquiry.Followup;



public interface FollowupManager {
	void addFollowup(Followup f1);
	List<Followup>getFollowup();
	void deletefollowup(int id);
}
