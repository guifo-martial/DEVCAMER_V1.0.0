/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;

/**
 * @author guifo
 *
 */
public class Langue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7343798691851839506L;
	
	private Long idLangue;
	private String langue;
	private String Description;
	private String localisation;
	

	/**
	 * 
	 */
	public Langue() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param langue
	 * @param description
	 * @param localisation
	 */
	public Langue(String langue, String description, String localisation) {
		super();
		this.langue = langue;
		Description = description;
		this.localisation = localisation;
	}



	/**
	 * @return the idLangue
	 */
	public Long getIdLangue() {
		return idLangue;
	}


	/**
	 * @param idLangue the idLangue to set
	 */
	public void setIdLangue(Long idLangue) {
		this.idLangue = idLangue;
	}


	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}


	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}


	/**
	 * @return the localisation
	 */
	public String getLocalisation() {
		return localisation;
	}


	/**
	 * @param localisation the localisation to set
	 */
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	

}
