package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.User;

@Repository
public interface IUserRepository  extends JpaRepository<User, Integer>{

}
