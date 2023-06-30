package com.devsuperior.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;
	
	//@HystrixCommand(fallbackMethod = "getPaymentError")
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		System.out.println("TESTE 1");
		Payment payment = service.getPayment(workerId, days);
				System.out.println("TESTE 4");

		return ResponseEntity.ok(payment);
	}	
	
	//public ResponseEntity<Payment> getPaymentError(Long workerId, Integer days) {
	//	Payment payment = new Payment("", 0.0, 0);
//
//		return ResponseEntity.badRequest().body(payment);
//	}
}
