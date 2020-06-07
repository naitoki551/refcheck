package com.restapi.refcheck.service;

import java.util.List;

import com.restapi.refcheck.entity.Task;
import com.restapi.refcheck.repository.TaskDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
  @Autowired
  TaskDao taskDao;

  public List<Task> findAll() {
    return taskDao.findAll();
  }
}