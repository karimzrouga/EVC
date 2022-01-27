package com.app.dev.SERVICES;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Appuser;
import com.app.dev.Repository.Daoappuser;

@Service
public class appuserservices extends Abstarctservices<Appuser> {
	@Autowired
	private Daoappuser DAOuser;
	

	@Override
	public Iterable<Appuser> findAll() {
		// TODO Auto-generated method stub
		return this.DAOuser.findAll();
	}

	@Override
	public Optional<Appuser> findbyid(int id) {
		// TODO Auto-generated method stub
		return this.DAOuser.findById(id);
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		this.DAOuser.deleteById(id);
	}

	@Override
	public Appuser update(Appuser a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appuser create(Appuser a) {
		// TODO Auto-generated method stub
		return this.DAOuser.save(a);
	}

	public Appuser findByusername(String name) {
		Appuser myuser = new Appuser();
		Iterable<Appuser> list = this.DAOuser.findAll();
		for (Appuser user : list) {
			if (user.getUsername().compareTo(name.toString()) == 0) {
				myuser = user;
			}
		}

		return myuser;
	}



	

}
