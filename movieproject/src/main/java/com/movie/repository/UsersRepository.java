package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.entity.Users;

public interface UsersRepository extends JpaRepository<Users , Long> 
{
    
}
