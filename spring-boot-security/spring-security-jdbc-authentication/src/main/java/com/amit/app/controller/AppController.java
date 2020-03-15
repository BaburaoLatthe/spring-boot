package com.amit.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.app.service.MyService;

/**
*
* @author Amit Patil
*
**/
@RestController
@RequestMapping("/v1")
public class AppController {

	@Autowired
	private MyService myService;
	
	@RequestMapping("/current/principal")
	public Principal getPrincipal(Principal principal) {
		return principal;
	}

//	Below endpoint also return the Principal which is represented by User in spring
//	the User principal doesn't contain the WebAuthenticalDetails object which includes
//	details like  remote-address, sessionId
	@RequestMapping("/current/user")
	public User getUser(@AuthenticationPrincipal User user) {
		return user;
	}
	
	@RequestMapping("/greeting/user")
	public String getUserGreeting(@AuthenticationPrincipal User user) {
		return myService.greeting(user.getUsername());
	}

	@RequestMapping("/greeting/admin")
	public String getAdminGreeting(@AuthenticationPrincipal User admin) {
		return myService.greeting(admin.getUsername());
	}
	
	@RequestMapping("/greeting/superadmin")
	public String getSuperAdminGreeting(@AuthenticationPrincipal User superAdmin) {
		return myService.greeting(superAdmin.getUsername());
	}
}
