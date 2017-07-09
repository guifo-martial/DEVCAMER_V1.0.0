/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author guifo
 *
 */
@Entity
@Table(name="ACCOUNT")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7827902443526893262L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long idAccount;
	@Column(name="LOGIN")
	private String login;
	@Column(name="PASSWORD")
	private String password;
	private Date  dateCreation;
	private Date  dateLastLogin;
	private boolean isActive;
	

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param login
	 * @param password
	 * @param dateCreation
	 * @param dateLastLogin
	 * @param isActive
	 * @param user
	 */
	public Account(String login, String password, Date dateCreation,
			Date dateLastLogin, boolean isActive) {
		super();
		this.login = login;
		this.password = password;
		this.dateCreation = dateCreation;
		this.dateLastLogin = dateLastLogin;
		this.isActive = isActive;
	
	}



	/**
	 * @return the idAccount
	 */
	public Long getIdAccount() {
		return idAccount;
	}

	/**
	 * @param idAccount the idAccount to set
	 */
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the dateLastLogin
	 */
	public Date getDateLastLogin() {
		return dateLastLogin;
	}

	/**
	 * @param dateLastLogin the dateLastLogin to set
	 */
	public void setDateLastLogin(Date dateLastLogin) {
		this.dateLastLogin = dateLastLogin;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
	

}
