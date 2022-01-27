package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.Specialite;

@Repository

public interface Daospecialite extends CrudRepository<Specialite, Integer>  {

}
