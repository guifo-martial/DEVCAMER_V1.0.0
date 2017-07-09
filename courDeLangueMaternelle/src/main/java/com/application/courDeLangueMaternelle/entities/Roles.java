/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;

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
@Table(name="ROLES")
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4257756760277951516L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
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
