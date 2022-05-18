package com.beyzayuksel.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyzayuksel.springboot.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
