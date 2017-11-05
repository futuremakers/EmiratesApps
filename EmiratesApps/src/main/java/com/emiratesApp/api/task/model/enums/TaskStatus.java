package com.emiratesApp.api.task.model.enums;

public enum TaskStatus {
	
	NEW, 
	PENDING,
	BLOCKED,
	COMPLETED
	;
	
    
    @Override
    public String toString() {
    	 return  name() ;
    }


}
