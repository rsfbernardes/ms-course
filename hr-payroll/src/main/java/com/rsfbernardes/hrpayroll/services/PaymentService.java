package com.rsfbernardes.hrpayroll.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsfbernardes.hrpayroll.entities.Payment;
import com.rsfbernardes.hrpayroll.entities.Worker;
import com.rsfbernardes.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, int days) {
		Optional<Worker> worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.get().getName(), worker.get().getDailyIncome(), days);
	}
	
}
