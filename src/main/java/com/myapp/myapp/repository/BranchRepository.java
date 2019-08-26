package com.myapp.myapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.myapp.model.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Long> {

}
