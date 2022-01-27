package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.Offre;

@Repository
public interface Daooffre extends CrudRepository<Offre, Integer> {

}
