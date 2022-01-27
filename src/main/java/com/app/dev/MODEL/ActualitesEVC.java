package com.app.dev.MODEL;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medactualite")
public class ActualitesEVC {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idactualite;
	private LocalDate data;
	private String titre;
	private String description;

	public ActualitesEVC(int idactualite, LocalDate data, String titre, String description) {

		this.idactualite = idactualite;
		this.data = data;
		this.titre = titre;
		this.description = description;
	}

	public ActualitesEVC() {

	}

	public int getIdactualite() {
		return idactualite;
	}

	public void setIdactualite(int idactualite) {
		this.idactualite = idactualite;
	}

	public LocalDate getData() {
		return data;
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

	@Override
	public String toString() {
		return "ActualitesEVC [idactualite=" + idactualite + ", data=" + data + ", titre=" + titre + ", description="
				+ description + "]";
	}

}
