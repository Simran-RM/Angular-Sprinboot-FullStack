package net.javaguides.springboot.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import net.javaguides.springboot.repository.*;
import net.javaguides.springboot.model.*;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private userRepo userRepository;
	
	
	//get all users
	
	@GetMapping("/users")
	public List<users> getALlUsers(){
		
		return userRepository.findAll();
	}
	
	
	//create user rest api
	@PostMapping("/users")
	public users createUser(@RequestBody users user) {
		return userRepository.save(user);
	}
}

