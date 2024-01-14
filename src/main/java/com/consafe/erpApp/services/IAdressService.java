package com.consafe.erpApp.services;

import java.util.List;

import com.consafe.erpApp.entities.Address;

public interface IAdressService {
	public void Insert(Address obj);
	public void update(Address obj);
	public void deleteById(Long id);
	public Address findById(Long id);
	public List<Address> findAll();
}
