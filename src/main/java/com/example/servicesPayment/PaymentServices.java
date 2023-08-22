package com.example.servicesPayment;

import java.util.List;
import java.util.Optional;

import com.example.entityPayment.Payment;

public interface PaymentServices {

	void addPayment(Payment payment);
	void deletePayment(int id);
	List<Payment> getAllPayment ();
	Optional<Payment> getPaymentbyID(int id);
}
