package com.app.dev.SERVICES;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Offre;
import com.app.dev.Repository.Daooffre;

@Service
public class Offreservices extends Abstarctservices<Offre> {

	private final Daooffre DAO;

	@Autowired
	public Offreservices(Daooffre dao) {
		this.DAO = dao;

	}

	@Override
	public Iterable<Offre> findAll() {
		// TODO Auto-generated method stub
		return this.DAO.findAll();
	}

	@Override
	public Optional<Offre> findbyid(int id) {
		// TODO Auto-generated method stub
		return this.DAO.findById(id);
	}

	@Override

	public Offre update(Offre act) {
		return this.DAO.save(act);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		this.DAO.deleteById(id);
	}

	@Override
	public Offre create(Offre a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

}
