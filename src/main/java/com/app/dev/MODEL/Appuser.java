package com.app.dev.MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table(name = "user")
public class Appuser {

	public Appuser(int id, String username, String password, String email, String fullName, String image) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		FullName = fullName;
		this.image = image;
	}

	public Appuser(String username, String password) {

		this.username = username;
		this.password = password;

	}

	public Appuser() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	@JsonIgnore
	private String password;
	private String email;
	private String FullName;
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getimage() {
		return image;
	}

	public void setimage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Appuser [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", FullName=" + FullName + ", image=" + image + "]";
	}
}
