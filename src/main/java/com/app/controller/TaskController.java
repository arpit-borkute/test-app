package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Task;
import com.app.service.TaskService;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

	@Autowired
	TaskService service;

	@PostMapping(value = "/create-task")
	public Map<String, String> createTask(@RequestBody Task task) {
		Map<String, String> response = new HashMap<>();
		boolean isAdded = service.createTask(task);
		if (!isAdded) {
			response.put("msg", "Task creation failed!");
		} else {
			response.put("msg", "Task succefully created with id " + task.getId());
		}
		return response;
	}
	
	
}
