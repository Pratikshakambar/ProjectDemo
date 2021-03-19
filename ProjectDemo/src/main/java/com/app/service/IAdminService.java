package com.app.service;

import com.app.pojos.Admin;

public interface IAdminService {
	Admin validateAdmin(String email,String password);
}
