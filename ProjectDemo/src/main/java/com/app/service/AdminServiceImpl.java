package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.LoginException;
import com.app.dao.AdminRepository;
import com.app.pojos.Admin;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService{

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin validateAdmin(String email, String password) {
		return adminRepository.findByEmailAndPassword(email, password).orElseThrow(()->new LoginException("Invalid credentials"));
		 
	}

}
