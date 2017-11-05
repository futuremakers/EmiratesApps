package com.emiratesApp.api.task.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emiratesApp.api.task.model.Task;
@Repository
public interface TaskRepo extends JpaRepository<Task, Long>{
	List<Task> findByName(String name);
}
