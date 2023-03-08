package com.movie.service;

import java.util.List;

import com.movie.entity.Users;
import com.movie.repository.UsersRepository;

public interface UsersService 
{
	
   List<Users>getAllUsers();
}