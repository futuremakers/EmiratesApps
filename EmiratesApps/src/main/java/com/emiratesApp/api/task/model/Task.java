package com.emiratesApp.api.task.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.emiratesApp.api.common.model.CommonEntity;
import com.emiratesApp.api.task.model.enums.TaskStatus;

@Entity
@Table(name="TASK")
public class Task extends CommonEntity {
	private static final long serialVersionUID = 7657484813957213669L;
	
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	public Task(Long id){
		setId(id);
	}
	@Enumerated(EnumType.STRING)
	private TaskStatus status;
	
	private Date assignedDate;
	
	private Date dueDate;
	
	
	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
}
