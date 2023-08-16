package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.Repository.IAdminRepository;
import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
//import com.crimsonlogic.studentcrudusinghibernate.repository.IAddressRepository;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminRepository adminRepo;

	@Override
	public List<Admin> viewAllAdmins() {
		
	return adminRepo.findAll();
	}

}
