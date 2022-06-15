package com.project.CRM.Service;

import com.project.CRM.DTO.UserDTO;

public interface LoginService {

	boolean login(String userName,String password);

	String registerUser(UserDTO user);
}
