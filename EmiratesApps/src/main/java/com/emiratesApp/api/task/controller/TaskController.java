package com.emiratesApp.api.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emiratesApp.api.task.model.Task;
import com.emiratesApp.api.task.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	TaskService taskSevice;
 
	@GetMapping(value="/api/tasks",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Task> getAll() {
		List<Task> tasks = taskSevice.listTasks();
		return tasks;
	}
	
	@PostMapping(value="/api/task")
	public Task postCustomer(@RequestBody Task task) {
		return taskSevice.saveTask(task);
	}
 
	@GetMapping(value="/api/findByName/{name}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Task> findByName(@PathVariable String name) {
		List<Task> tasks = taskSevice.findByName(name);
		return tasks;
	}
	
	@DeleteMapping(value="/api/task/{id}")
	public void deleteTask(@PathVariable String id){
		taskSevice.deleteTask(new Task(Long.parseLong(id)));
	}
}
