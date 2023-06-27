package com.devsuperior.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@RestController
@RefreshScope
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Value("${test.config}")
	private String testConfig;

	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		System.out.println("CONFIGURAÇÃO: " + testConfig);
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
				
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}	

	@GetMapping(value = "/configs")
	public ResponseEntity<String> config() {
		System.out.println("CONFIGURAÇÃO: " + testConfig);
		return ResponseEntity.ok(testConfig);
	}	
}
