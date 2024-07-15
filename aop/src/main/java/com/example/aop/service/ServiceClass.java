package com.example.aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.model.ModelClass;
import com.example.aop.repository.RepoClass;

@Service
public class ServiceClass {
	
	@Autowired
    private RepoClass repository;

    public List<ModelClass> findAll() {
        return repository.findAll();
    }

    public ModelClass findById(Long id) {
        return repository.findById(id).get();
    }

    public String addDetails(ModelClass modelClass) {
        repository.save(modelClass);
        return "Add Success";
    }

    public String deleteById(Long id) {
        repository.deleteById(id);
        return "Delete Success";
    }

    public String updateDetails(Long id, ModelClass modelClassDetails) {
    	repository.save(modelClassDetails);
    	return "Update Success";
    }
}
