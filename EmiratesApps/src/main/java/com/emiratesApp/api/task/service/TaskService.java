package com.emiratesApp.api.task.service;

import java.util.List;

import com.emiratesApp.api.task.model.Task;

public interface TaskService {
	public List<Task> listTasks();
	public Task saveTask(Task task);
	public List<Task> findByName(String name);
	public Boolean deleteTask(Task task);
}
