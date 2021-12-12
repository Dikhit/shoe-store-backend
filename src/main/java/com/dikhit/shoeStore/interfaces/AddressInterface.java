package com.dikhit.shoeStore.interfaces;

import java.util.List;

import com.dikhit.shoeStore.model.Address;

public interface AddressInterface {
	Address create(long userId, Address address);
	List<Address> getAllAddresses(long userId);
	Address update(Address address);
	String delete(long id);
}
