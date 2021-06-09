package com.quest.pnext.authservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(length = 255)
	private String username;
	
	@Column(length = 16)
	private Long password;
	
	@Column(length = 1)
	private String active;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}
	
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", username=");
		builder.append(username);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}

}
