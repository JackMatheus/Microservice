package com.github.jackmatheus.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.jackmatheus.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
	
	

}
