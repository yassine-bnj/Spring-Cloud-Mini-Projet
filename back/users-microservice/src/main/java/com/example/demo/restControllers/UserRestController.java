package com.example.demo.restControllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repos.RoleRepository;
import com.example.demo.repos.UserRepository;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/Userapi")
public class UserRestController {

	
	
	@Autowired
	UserRepository userRep;
	
	@Autowired
	RoleRepository roleRep;
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public List<User> getAllUserss() {
		return userRep.findAll();
	 }
	
	@RequestMapping(value = "/users/all",method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userRep.findAll();
	 }
	
	@RequestMapping(value = "/users/roles",method = RequestMethod.GET)
	public List<Role> getAllRoles() {
		return roleRep.findAll();
	 }
	

	@RequestMapping(value = "/users/{id}" ,method = RequestMethod.GET)
	public Optional<User> getUserById(@PathVariable("id") Long id) {
	return userRep.findById(id);
	 }
	
	@RequestMapping(value = "/users/getByusername/{username}" ,method = RequestMethod.GET)
	public User getUserByUsername(@PathVariable("username") String username) {
	return userService.findUserByUsername(username);
	 }
	
	
	
	
	@RequestMapping(value = "/users",method = RequestMethod.POST)
	public User createUser(@RequestBody User u) {
		
		
		
	return userService.saveUser(u);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User u) {

		return userService.updateUser(u);
		
		
	}
	
	@RequestMapping(value="/users/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id)
	{
		//System.out.println("delete");
		userService.deleteUserById(id);
	}
	
	
	@RequestMapping(value = "/users/register",method = RequestMethod.POST)
	public User registerUser(@RequestBody User u) {
		
	   return userService.registerUser(u);
	}
	
	
	@RequestMapping(value = "/users/changePassword/{id}",method = RequestMethod.PUT)
	public User ChangePassword(@RequestParam("oldPass") String oldPass,@RequestParam("newPass") 
	String newPass,@PathVariable("id") Long id) {
		
		System.out.println("old = "+oldPass + " new = "+newPass);
		
			return  userService.ChangePassword(oldPass,newPass,id);
			
	
		
		
	
		
		
		
	}
	
	@RequestMapping(value = "/users/verifEmail/{email}/{code}" ,method = RequestMethod.GET)
	public User verifEmail(@PathVariable("email") String email,@PathVariable("code") String code) {
	return userService.verifEmail(email, code);
	 }
	
	
	
	
	
	
	
	
}
