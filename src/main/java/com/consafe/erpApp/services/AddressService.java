package com.consafe.erpApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consafe.erpApp.entities.Address;
import com.consafe.erpApp.repositories.AddressRepository;

@Service
public class AddressService implements IAdressService{
	
	@Autowired
	private AddressRepository repository;

	@Override
	public void insert(Address obj) {
		repository.save(obj);		
	}

	@Override
	public void update(Address obj) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void delete(Address obj) {
		repository.delete(obj);		
	}

	@Override
	public Address findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Address> findAll(){
		return repository.findAll();		
	}
}
