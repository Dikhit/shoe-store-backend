package com.dikhit.shoeStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dikhit.shoeStore.interfaces.AddressInterface;
import com.dikhit.shoeStore.model.Address;
import com.dikhit.shoeStore.model.User;
import com.dikhit.shoeStore.repository.AddressRepository;


@Service
public class AddressService implements AddressInterface {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private UserService userService;
	
	@Override
	public Address create(long userId, Address address) {
		User user = userService.getUserById(userId);
		address.setUser(user);
		return addressRepository.save(address);
	}
	
	@Override
	public List<Address> getAllAddresses(long userId) {
		return null;
	}

	@Override
	public Address update(Address address) {
		return null;
	}

	@Override
	public String delete(long id) {
		return null;
	}

	

}
