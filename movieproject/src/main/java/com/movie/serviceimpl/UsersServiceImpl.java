package com.movie.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.entity.Users;
import com.movie.repository.UsersRepository;
import com.movie.service.UsersService;

@Service
public class UsersServiceImpl
{
	@Autowired
    UsersRepository usersRepository;
    
    
	public UsersServiceImpl(UsersRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}

	public List<Users> getAllUsers() 
	{
		return usersRepository.findAll();
	  
	}
  
}
