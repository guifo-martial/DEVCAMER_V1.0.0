/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

/**
 * @author guifo
 *
 */
@Entity
@Table(name="UT")
public class UT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606993853070865453L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long idUT;
	private Date dateUT;
	@ManyToMany
	@JoinTable(name="UT_COUR")
	private List<Cour> cours;
	@ManyToOne
	@JoinColumn(name="CODE_SESSION")
	private Session session;
	
	

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

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
	public UT(Date dateUT, List<Cour> cours, Session session) {
		this.dateUT = dateUT;
		this.cours = cours;
		this.session = session;
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
