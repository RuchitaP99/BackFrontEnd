package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/url")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	
	
    @PostMapping("/create-post")
    public Customer createEmployee(@RequestBody Customer customer) {
       
    	Customer savedCustomer = customerRepository.save(customer);
    	 
    	 return savedCustomer;
    }
    
    @GetMapping("/get")
    public List<Customer> getAllEmployee(){
    	List<Customer> allEmployeelist = customerRepository.findAll();
    	return allEmployeelist;
    	
    }
}
