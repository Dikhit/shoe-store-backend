package com.dikhit.shoeStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dikhit.shoeStore.model.Address;
import com.dikhit.shoeStore.service.AddressService;

@RestController
@RequestMapping("api/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@PostMapping("{id}")
	public ResponseEntity<Address> create(@PathVariable("id") long id, @RequestBody Address address) {
		return new ResponseEntity<> (addressService.create(id, address), HttpStatus.OK);
	}
}
