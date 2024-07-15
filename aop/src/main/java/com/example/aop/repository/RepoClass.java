package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.model.ModelClass;

@Repository
public interface RepoClass extends JpaRepository<ModelClass, Long>{

}
