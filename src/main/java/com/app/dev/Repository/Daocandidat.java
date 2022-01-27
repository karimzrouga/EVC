package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.Candidat;

@Repository
public interface Daocandidat extends CrudRepository<Candidat, Integer> {

}
