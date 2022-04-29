package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.APIRequest;
import com.example.entity.APIResponse;
import com.example.service.APIService;




@RestController
//@RequestMapping
public class DataController {
	@Autowired
	private APIService service;
	
	@PostMapping("/bfhl")
	public APIResponse processRequest(@RequestBody APIRequest apiRequest)
	{
		APIResponse response = service.processApiRequest(apiRequest);
		
//		return new ResponseEntity<>(response,HttpStatus.OK);
		return response;
	}
	

}
