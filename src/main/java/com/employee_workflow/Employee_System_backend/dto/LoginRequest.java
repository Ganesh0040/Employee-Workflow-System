package com.employee_workflow.Employee_System_backend.dto;

public class LoginRequest {
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
    private String password;

    // Getters and setters
}