package com.capgemini.Voting_system.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String userName;
	
	private String userEmail;
	
	private String passwordHash;
	
	private LocalDate createdAt;
	
	private LocalDate dob;
	
	private String role;
	
	public Users() {
		
	}

	public Users(Long userId, String userName, String userEmail, String passwordHash, LocalDate createdAt,
			LocalDate dob, String role) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.passwordHash = passwordHash;
		this.createdAt = createdAt;
		this.dob = dob;
		this.role = role;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", passwordHash="
				+ passwordHash + ", createdAt=" + createdAt + ", dob=" + dob + ", role=" + role + "]";
	}
	
	

}
