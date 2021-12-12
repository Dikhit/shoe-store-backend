package com.dikhit.shoeStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dikhit.shoeStore.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
