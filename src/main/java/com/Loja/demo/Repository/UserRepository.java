package com.Loja.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.Loja.demo.User.User;

public interface UserRepository extends JpaRepository<User, String> {
  UserDetails findByLogin(String login);

}
