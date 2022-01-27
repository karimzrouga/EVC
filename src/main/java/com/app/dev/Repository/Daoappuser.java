package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;

import com.app.dev.MODEL.Appuser;

public interface Daoappuser extends CrudRepository<Appuser, Integer> {
	 Appuser findUserByUsername(String username); 
}
