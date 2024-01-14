package com.consafe.erpApp.services;

import java.util.List;

import com.consafe.erpApp.entities.Address;

public interface IAdressService {
	public void insert(Address obj);
	public void update(Address obj);
	public void delete(Address obj);
	public Address findById(Long id);
	public List<Address> findAll();
}
