package com.app.dev.MODEL;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medoffre")
public class Offre {
	public Offre(int idoffre, LocalDate data, String titre, String description, String image) {

		this.idoffre = idoffre;
		this.data = data;
		this.titre = titre;
		this.description = description;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idoffre;
	private LocalDate data;
	private String titre;
	private String description;
	private String image;

	public Offre() {

	}

	public int getIdoffre() {
		return idoffre;
	}

	public void setIdoffre(int idoffre) {
		this.idoffre = idoffre;
	}

	public String getData() {
		return data.toString();
	}

	public void setData(LocalDate data) {
		this.data = data;
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
		return "Offre [idoffre=" + idoffre + ", data=" + data + ", titre=" + titre + ", description=" + description
				+ ", image=" + image + "]";
	}

}
