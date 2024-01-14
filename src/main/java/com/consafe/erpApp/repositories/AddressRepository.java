package com.consafe.erpApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consafe.erpApp.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
