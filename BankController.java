package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.BankEntity;
import com.bank.service.BankService;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	
	@Autowired
	BankService bs;
	
	@PostMapping(value="/postValue")
	public String postValue(@RequestBody List<BankEntity> a) {
		return bs.postValue(a);
	}
	
	@GetMapping(value="/getBrnch/{a}")
	public String getBrnch(@PathVariable String a) {
		return bs.getBrnch(a);
	}

}
