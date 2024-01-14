package com.consafe.erpApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.consafe.erpApp.entities.Address;
import com.consafe.erpApp.repositories.AddressRepository;

public class AddressService implements IAdressService{
	
	@Autowired
	private AddressRepository repository;

	@Override
	public void Insert(Address obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Address obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Address findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Address> findAll(){
		return repository.findAll();		
	}
}
