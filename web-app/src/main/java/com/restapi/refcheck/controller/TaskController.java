package com.restapi.refcheck.controller;

import java.util.List;

import com.restapi.refcheck.entity.Task;
import com.restapi.refcheck.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskController {
  @Autowired
  TaskService taskService;

  @GetMapping
  List<Task> getitems() {
    List<Task> tasks = taskService.findAll();
    return tasks;
  }
}