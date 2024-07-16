package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
