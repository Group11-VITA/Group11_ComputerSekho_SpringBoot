package com.example.servicesPayment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityPayment.Payment;
import com.example.repositoryPayment.PaymentRepository;


@Service
public class PaymentServiceImp implements PaymentServices {
	
	@Autowired
	private PaymentRepository payment_repository;
	

	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		payment_repository.save(payment);
		
		
	}

	@Override
	public void deletePayment(int id) {
		// TODO Auto-generated method stub
		payment_repository.deleteById(id);
		
	}

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		List<Payment> list = payment_repository.findAll();
		return list;
	}

	@Override
	public Optional<Payment> getPaymentbyID(int id) {
		// TODO Auto-generated method stub
		Optional<Payment> payment = payment_repository.findById(id);
		return payment;
	}

}
