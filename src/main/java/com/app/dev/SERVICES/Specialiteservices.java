package com.app.dev.SERVICES;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Specialite;
import com.app.dev.Repository.Daospecialite;

@Service
public class Specialiteservices extends Abstarctservices<Specialite> {
	private final Daospecialite DAO;

	@Autowired
	public Specialiteservices(Daospecialite dAO) {
		this.DAO = dAO;
	}

	@Override
	public Iterable<Specialite> findAll() {

		return this.DAO.findAll();
	}

	@Override
	public Optional<Specialite> findbyid(int id) {
		// TODO Auto-generated method stub
		return this.DAO.findById(id);
	}

	@Override
	public void Delete(int id) {
		this.DAO.deleteById(id);
	}

	@Override
	public Specialite update(Specialite a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

	@Override
	public Specialite create(Specialite a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

}
