package com.app.dev.MODEL;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medcandidat")
public class Candidat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idcandidat;
	private String nom;
	private String prenom;
	private String specialite;
	private String pays;
	private String remarque;
	private String email;
	private String facebook;
	private String linkedin;
	private LocalDate datemessage;

	public Candidat(int idcandidat, String nom, String prenom, String specialite, String pays, String remarque,
			String email, String facebook, String linkedin, LocalDate datemessage) {

		this.idcandidat = idcandidat;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.pays = pays;
		this.remarque = remarque;
		this.email = email;
		this.facebook = facebook;
		this.linkedin = linkedin;
		this.datemessage = datemessage;
	}

	public Candidat() {

	}

	public int getIdcandidat() {
		return idcandidat;
	}

	public void setIdcandidat(int idcandidat) {
		this.idcandidat = idcandidat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public LocalDate getDatemessage() {
		return datemessage;
	}

	public void setDatemessage(LocalDate datemessage) {
		this.datemessage = datemessage;
	}

	@Override
	public String toString() {
		return "Candidat [idcandidat=" + idcandidat + ", nom=" + nom + ", prenom=" + prenom + ", specialite="
				+ specialite + ", pays=" + pays + ", remarque=" + remarque + ", email=" + email + ", facebook="
				+ facebook + ", linkedin=" + linkedin + ", datemessage=" + datemessage + "]";
	}

}
