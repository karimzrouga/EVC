package com.app.dev.SERVICES;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Candidat;
import com.app.dev.Repository.Daocandidat;

@Service
public class Candidatservices extends Abstarctservices<Candidat> {

	private final Daocandidat DAO;

	@Autowired
	public Candidatservices(Daocandidat dao) {
		this.DAO = dao;

	}

	@Override
	public Iterable<Candidat> findAll() {
		// TODO Auto-generated method stub
		return this.DAO.findAll();
	}

	@Override
	public Optional<Candidat> findbyid(int id) {
		// TODO Auto-generated method stub
		return this.DAO.findById(id);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		this.DAO.deleteById(id);
	}

	@Override
	public Candidat update(Candidat a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

	@Override
	public Candidat create(Candidat a) {
		// TODO Auto-generated method stub
		return this.DAO.save(a);
	}

}
