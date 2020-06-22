package com.ke.Login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ke.Login.models.MyUser;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {

	MyUser findByUsername(String username);
}
