package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.Formation;

@Repository
public interface Daoformation extends CrudRepository<Formation, Integer> {

}
