package com.emiratesApp.api.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emiratesApp.api.task.dao.TaskRepo;
import com.emiratesApp.api.task.model.Task;

@Service("taskService")
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepo taskRepo;
	
	@Override
	public List<Task> listTasks() {
		return taskRepo.findAll();
	}

	@Override
	public Task saveTask(Task task) {
		return taskRepo.save(task);
	}

	@Override
	public List<Task> findByName(String name) {
		return taskRepo.findByName(name);
	}

	@Override
	public Boolean deleteTask(Task task) {
		 taskRepo.delete(task);
		return true;
	}

	
}
