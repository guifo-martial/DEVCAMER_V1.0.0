/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;

/**
 * @author guifo
 *
 */
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4257756760277951516L;
	
	private Long idRoles;
	private String libelle;
	private String description;

	/**
	 * 
	 */
	public Roles() {
		// TODO Auto-generated constructor stub
	}
	
	public Roles(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}

	
	public Long getIdRoles() {
		return idRoles;
	}

	public void setIdRoles(Long idRoles) {
		this.idRoles = idRoles;
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

	
}
