package com.app.dev.SERVICES;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Formation;
import com.app.dev.Repository.Daoformation;

@Service
public class Formationservices extends Abstarctservices<Formation> {
	private final Daoformation DAO;

	@Autowired
	public Formationservices(Daoformation dAO) {

		DAO = dAO;
	}

	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return this.DAO.findAll();
	}

	@Override
	public Optional<Formation> findbyid(int id) {
		// TODO Auto-generated method stub
		return this.DAO.findById(id);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		this.DAO.deleteById(id);
	}

	@Override
	public Formation update(Formation a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

	@Override
	public Formation create(Formation a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

}
