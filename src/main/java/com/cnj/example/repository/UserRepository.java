/**
 * 
 */
package com.cnj.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnj.example.model.User;

/**
 * @author richard-park
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}
