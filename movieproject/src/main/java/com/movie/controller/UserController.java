package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.movie.service.UsersService;
import com.movie.serviceimpl.UsersServiceImpl;

@Controller
public class UserController
{
	@Autowired
	UsersServiceImpl usersService;
	
	
	@GetMapping("/Users")
	public String listUsers(Model model)
	{
		model.addAttribute("Users",usersService.getAllUsers());
		return "Users";
	}
	@PostMapping("/api/Users")
	public String Customers(Model model)
	{
		model.addAttribute("Users",usersService.getAllUsers());
		return "";
	}
}
