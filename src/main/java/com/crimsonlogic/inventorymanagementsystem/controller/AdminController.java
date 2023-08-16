package com.crimsonlogic.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.service.IAdminService;




@RestController
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired                            
	private IAdminService adminService;
	
	
	@RequestMapping("/viewallstudents")
	public List<Admin> viewAllAdmins(){
return adminService.viewAllAdmins();
}
}
