package com.app.service;

import java.util.List;

import com.app.entity.Task;

public interface TaskService {
	public boolean createTask(Task task);

	public Task fetchTask(int id);

	public boolean updateTask(Task task);

	public boolean deleteTask(int id);

	public boolean updateTasks(List<Task> tasks);
}
