package com.example.repositoryPayment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entityPayment.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
