/**
 * 
 */
package com.cnj.example.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnj.example.model.User;
import com.cnj.example.repository.UserRepository;

/**
 * @author richard-park
 *
 */
@Component
public class DBWriter implements ItemWriter<User>{

	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public void write(List<? extends User> users) throws Exception {
		UserRepository.saveAll(users);
		
	}
	

}
