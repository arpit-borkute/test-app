package com.app.entity;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task implements Comparable<Task>{
	
	@Id
	private int id;
	
	private String name;
	
	private String assignee;
	
	private String assigner;
	
	private State state;
	public Task() {
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String name, String assignee, String assigner, State state) {
		super();
		this.id = id;
		this.name = name;
		this.assignee = assignee;
		this.assigner = assigner;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getAssigner() {
		return assigner;
	}
	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", assignee=" + assignee + ", assigner=" + assigner + ", state="
				+ state + "]";
	}
	@Override
	public int compareTo(Task o) {
		return this.id-o.id;
	}
	
	Comparator<Task> comparator = new Comparator<Task>() {
		
		@Override
		public int compare(Task o1, Task o2) {
			return o2.getName().compareTo(o1.getName());
		}
	};
}
