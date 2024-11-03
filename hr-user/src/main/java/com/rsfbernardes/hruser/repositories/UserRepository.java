package com.rsfbernardes.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsfbernardes.hruser.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{	

	User findByEmail(String email);
	
}
