package com.shoesstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.shoesstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

}
