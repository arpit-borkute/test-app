package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.Task;
import com.app.repository.TaskRepository;
import com.app.service.TaskService;

public class TaskServiceImpl implements TaskService{

	@Autowired
	TaskRepository repository;
	
	@Override
	public boolean createTask(Task task) {
		
		return repository.createTask(task);
	}

	@Override
	public Task fetchTask(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTask(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTasks(List<Task> tasks) {
		// TODO Auto-generated method stub
		return false;
	}

}
