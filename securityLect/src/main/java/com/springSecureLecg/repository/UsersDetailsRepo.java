package com.springSecureLecg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSecureLecg.entity.UsersDetailsEntity;

public interface UsersDetailsRepo extends JpaRepository<UsersDetailsEntity, Integer> {

	Optional<UsersDetailsEntity> findByEmail(String email);
}
