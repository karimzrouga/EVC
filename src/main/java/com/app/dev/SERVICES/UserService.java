package com.app.dev.SERVICES;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dev.MODEL.Appuser;
import com.app.dev.Repository.Daoappuser;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	private Daoappuser DAOuser;

	@Bean
	private PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Appuser user =new Appuser ();
		user=this.DAOuser.findUserByUsername(username);

		return new User(user.getUsername(), passwordEncoder().encode(user.getPassword()), AuthorityUtils.NO_AUTHORITIES);

	}

	public void save(Appuser user) {
		user.setPassword(passwordEncoder().encode(user.getPassword()));
		this.DAOuser.save(user);
	}

	public List<Appuser> findAll() {
		// TODO Auto-generated method stub
		return (List<Appuser>) this.DAOuser.findAll();
	}

}