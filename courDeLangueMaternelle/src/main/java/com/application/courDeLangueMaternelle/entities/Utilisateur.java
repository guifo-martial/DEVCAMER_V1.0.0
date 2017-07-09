/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author guifo
 *
 */
@Entity
@Table(name="USERS")
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6995262407074062962L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long idUser;
	@Column(name = "nom", nullable = false, length = 100)
	private String nom;
	@Column(name = "prenom", nullable = false, length = 100)
	private String prenom;
	private String mail;
	@ManyToMany
	@JoinTable(name="USERS_ROLES")
	private List<Roles> roles;
	@OneToOne(cascade = CascadeType.ALL)
	private Account account ;
	


	/**
	 * 
	 */
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Utilisateur(String nom, String prenom, String mail,
			List<Roles> roles, Account account) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.roles = roles;
		this.account =account;
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
	
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}


	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

}
