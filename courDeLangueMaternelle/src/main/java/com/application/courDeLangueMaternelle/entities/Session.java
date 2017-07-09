/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author guifo
 *
 */
@Entity
@Table(name="SESSION")
public class Session implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 273675027650004389L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="CODE_SESSION")
	private Long idSession;
	private Date dateDebut;
	private Date dateFin;
	@OneToMany(mappedBy="session",fetch=FetchType.LAZY)
	private List<UT> uts;
	
	
	/**
	 * @return the idSession
	 */
	public Long getIdSession() {
		return idSession;
	}

	/**
	 * @param idSession the idSession to set
	 */
	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the uts
	 */
	public List<UT> getUts() {
		return uts;
	}

	/**
	 * @param uts the uts to set
	 */
	public void setUts(List<UT> uts) {
		this.uts = uts;
	}

	/**
	 * 
	 */
	public Session() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dateDebut
	 * @param dateFin
	 * @param uts
	 */
	public Session(Date dateDebut, Date dateFin, List<UT> uts) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.uts = uts;
	}
	
	

}
