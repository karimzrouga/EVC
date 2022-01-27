package com.app.dev.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dev.MODEL.ActualitesEVC;

@Repository
public interface DAOActualitesEVC extends CrudRepository<ActualitesEVC, Integer> {

}
