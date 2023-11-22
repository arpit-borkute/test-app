package com.app.repository;

import java.util.List;

import com.app.entity.Task;


public interface TaskRepository {
	
	public boolean createTask(Task task);
	public Task fetchTask(int id);
	public boolean updateTask(Task task);
	public boolean deleteTask(int id);
	public boolean updateTasks(List<Task> tasks);
	
}
