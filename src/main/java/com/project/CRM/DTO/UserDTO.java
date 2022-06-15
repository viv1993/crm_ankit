package com.project.CRM.DTO;

import lombok.Data;

@Data
public class UserDTO {
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private String leadStatus;
}
