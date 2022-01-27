package com.app.dev.SERVICES;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.ActualitesEVC;
import com.app.dev.Repository.DAOActualitesEVC;

@Service
public class Actualitesservices extends Abstarctservices<ActualitesEVC> {

	private final DAOActualitesEVC DAO;

	@Autowired
	public Actualitesservices(DAOActualitesEVC dao) {
		this.DAO = dao;

	}

	@Override
	public Iterable<ActualitesEVC> findAll() {
		// TODO Auto-generated method stub
		return this.DAO.findAll();
	}

	@Override
	public Optional<ActualitesEVC> findbyid(int id) {
		// TODO Auto-generated method stub
		return this.DAO.findById(id);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		this.DAO.deleteById(id);
	}

	@Override
	public ActualitesEVC update(ActualitesEVC a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

	@Override
	public ActualitesEVC create(ActualitesEVC a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

}
