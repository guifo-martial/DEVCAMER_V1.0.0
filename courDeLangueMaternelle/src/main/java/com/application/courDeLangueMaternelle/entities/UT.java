/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author guifo
 *
 */
public class UT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606993853070865453L;
	
	private Long idUT;
	private Date dateUT;
	private List<Cour> cours;

	/**
	 * 
	 */
	public UT() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dateUT
	 * @param cours
	 */
	public UT(Date dateUT, List<Cour> cours) {
		this.dateUT = dateUT;
		this.cours = cours;
	}

	/**
	 * @return the idUT
	 */
	public Long getIdUT() {
		return idUT;
	}

	/**
	 * @param idUT the idUT to set
	 */
	public void setIdUT(Long idUT) {
		this.idUT = idUT;
	}

	/**
	 * @return the dateUT
	 */
	public Date getDateUT() {
		return dateUT;
	}

	/**
	 * @param dateUT the dateUT to set
	 */
	public void setDateUT(Date dateUT) {
		this.dateUT = dateUT;
	}

	/**
	 * @return the cours
	 */
	public List<Cour> getCours() {
		return cours;
	}

	/**
	 * @param cours the cours to set
	 */
	public void setCours(List<Cour> cours) {
		this.cours = cours;
	}

	
}
