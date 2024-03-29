package com.bank.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.transfer.entity.TransferMoney;
import com.bank.transfer.service.TransferMoneyService;

@RestController
@RequestMapping("/transfermoney")
public class TransferMoneyController {
	
	@Autowired
	private TransferMoneyService transferMoneyService;
	
	@PostMapping("/transfer")
	public ResponseEntity<String> transferMoney(@RequestBody TransferMoney transfer){
		String response = transferMoneyService.transferMoney(transfer);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
