package com.restapi.refcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.refcheck.entity.Task;

public interface TaskDao extends JpaRepository<Task, Integer> {
}