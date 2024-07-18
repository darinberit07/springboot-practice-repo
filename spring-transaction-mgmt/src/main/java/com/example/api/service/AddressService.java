package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.api.model.Address;
import com.example.api.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
    
    @Transactional(propagation = Propagation.REQUIRED)
    public Address addAddress(Address address) {
        Address savedAddress = addressRepository.save(address);
        return savedAddress;
    }
}
