package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Department;

@Repository
public interface HomeRepoI extends CrudRepository<Department, Integer>{

}
