package com.project.CRM.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.CRM.DTO.UserDTO;
import com.project.CRM.Entity.User;
import com.project.CRM.Repos.UserRepo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserDetailsService userDetailsService;

	@Autowired
	AuthenticationManager authenticationManger;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public boolean login(String userName, String password) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, password,
				userDetails.getAuthorities());
		authenticationManger.authenticate(token);
		boolean result = token.isAuthenticated();

		if (result) {
			SecurityContextHolder.getContext().setAuthentication(token);
		}
		return result;
	}
	
	@Override
	public String registerUser(UserDTO user) {
		String responseMsg = "";
		try {
			User userDetails = userRepo.findByEmail(user.getEmail());
			if(userDetails != null) {
				responseMsg = "Email is already available in db";
			}
			if(user.getPassword().equals(user.getConfirmPassword())) {
				User obj = new User();
				BeanUtils.copyProperties(user, obj);
				obj.setPassword(encoder.encode(user.getPassword()));
				userRepo.save(obj);
				responseMsg = "User created successfully";
			} else {
				responseMsg = "Password and confirm password are not same";
			}
		} catch (Exception e) {
			responseMsg = "Some error occurred";
			System.err.println(e);
		}
		
		return responseMsg;
	}

}
