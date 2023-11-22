package com.app.repositoryImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.Task;
import com.app.repository.TaskRepository;

public class TaskRepositoryImpl implements TaskRepository{

	
	@Autowired
	SessionFactory factory;
	
	@Override
	public boolean createTask(Task task) {
		Session session = null;
		boolean isAdded= false;
		try {
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(task);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return isAdded;
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
