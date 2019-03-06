package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	// attributs
	private String matricule; 
	private String nom;
	private String prenom;
	private LocalDate birthDate;
	private String adresse;
	private String numSecuSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	boolean actif;
	
	
	//contructeur	
	public Collaborateur(String matricule, String nom, String prenom, LocalDate birthDate, String adresse,
			String numSecuSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation, boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.birthDate = birthDate;
		this.adresse = adresse;
		this.numSecuSociale = numSecuSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}
	
	
	// getters and setters
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumSecuSociale() {
		return numSecuSociale;
	}
	public void setNumSecuSociale(String numSecuSociale) {
		this.numSecuSociale = numSecuSociale;
	}
	public String getMailPro() {
		return emailPro;
	}
	public void setMailPro(String mailPro) {
		this.emailPro = mailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getHeureCreation() {
		return dateHeureCreation;
	}
	public void setHeureCreation(ZonedDateTime heureCreation) {
		this.dateHeureCreation = heureCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}

}
