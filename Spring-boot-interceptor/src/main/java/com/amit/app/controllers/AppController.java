package com.amit.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amit.app.models.Address;
import com.amit.app.models.User;
import com.amit.app.service.FirstUserService;
/**
*
* @author Amit Patil
*
**/
@RestController
@RequestMapping("/v1")
public class AppController {

	@Autowired
	private FirstUserService firstUserService;
	
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserDetails(@PathVariable("userId") String id) {
		return firstUserService.getUserById(id);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User saveUserDetails(@RequestBody @Validated User user) {
		
		return firstUserService.saveUserDetails(user);
	}
	
	@RequestMapping(value = "/address/{addressId}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Address getAddressDetails(@PathVariable("addressId") String id) {
		return firstUserService.getAddressById(id);
	}
}
