package com.app.dev.MODEL;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medspecialite")
public class Specialite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idspecialite;
	private String libelle;
	private String description;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "specialites")
	private List<Formation> formation=new ArrayList<>();

	public Specialite(int idspecialite, String libelle, String description) {

		this.idspecialite = idspecialite;
		this.libelle = libelle;
		this.description = description;
	}

	public Specialite() {

	}

	public int getIdspecialite() {
		return idspecialite;
	}

	public void setIdspecialite(int idspecialite) {
		this.idspecialite = idspecialite;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Formation> getFormation() {
		return formation;
	}

	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}

}
