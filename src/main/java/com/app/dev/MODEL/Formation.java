package com.app.dev.MODEL;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medformation")
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idformation;
	private String titre;
	private String description;
	private String image;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "medspecialitesupport", joinColumns = @JoinColumn(name = "idformation"), inverseJoinColumns = @JoinColumn(name = "idspecialite"))
	private List<Specialite> specialites;

	public Formation(int idformation, String titre, String description, String image) {

		this.idformation = idformation;
		this.titre = titre;
		this.description = description;
		this.image = image;
	}

	public Formation() {

	}

	public int getIdformation() {
		return idformation;
	}

	public void setIdformation(int idformation) {
		this.idformation = idformation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Formation [idformation=" + idformation + ", titre=" + titre + ", description=" + description
				+ ", image=" + image + "]";
	}

	public List<Specialite> getSpecialite() {
		return specialites;
	}

	public void setSpecialite(List<Specialite> specialite) {
		this.specialites = specialite;
	}

}
