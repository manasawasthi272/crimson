package com.crimsonlogic.inventorymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="admindetails")
public class Admin {
	@Id
	private int adminId;
	private String adminName;
	private String adminEmail;
	private String adminUserName;
	private int adminPassword;
	public Admin() {
		super();
	}
	public Admin(int adminId, String adminName, String adminEmail, String adminUserName, int adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public int getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(int adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + "]";
	}
	
	
	

}
