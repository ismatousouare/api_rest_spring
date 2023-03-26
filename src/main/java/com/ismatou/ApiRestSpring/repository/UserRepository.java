package com.ismatou.ApiRestSpring.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ismatou.ApiRestSpring.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
