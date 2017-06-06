/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.List;

/**
 * @author guifo
 *
 */
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6995262407074062962L;
	
	private Long idUser;
	private String nom;
	private String prenom;
	private String mail;
	private List<Roles> roles;
	/**
	 * 
	 */
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Utilisateur(String nom, String prenom, String mail, List<Roles> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.roles = roles;
	}


	/**
	 * @return the idUser
	 */
	public Long getIdUser() {
		return idUser;
	}
	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the roles
	 */
	public List<Roles> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
	

}
