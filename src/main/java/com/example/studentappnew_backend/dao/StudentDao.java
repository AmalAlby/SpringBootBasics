package com.example.studentappnew_backend.dao;

import com.example.studentappnew_backend.model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Students,Integer> {
}
