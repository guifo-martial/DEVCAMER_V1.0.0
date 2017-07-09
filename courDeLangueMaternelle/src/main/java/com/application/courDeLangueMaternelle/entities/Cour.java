/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name="COUR")
public class Cour implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6747491684129358910L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long idCour;
	private String lieuCour;
	@OneToOne(cascade = CascadeType.ALL)
	private Langue langueDispense;
	@ManyToMany
	@JoinTable(name="Participants")
	private List<Utilisateur> participants;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Utilisateur professeurs;
	private boolean isDispend;
	
	

	




	/**
	 * 
	 */
	public Cour() {
		// TODO Auto-generated constructor stub
	}

	


	/**
	 * @param lieuCour
	 * @param langueDispense
	 * @param participants
	 * @param professeurs
	 */
	public Cour(String lieuCour, Langue langueDispense, List<Utilisateur> participants, Utilisateur professeurs) {
		this.lieuCour = lieuCour;
		this.langueDispense = langueDispense;
		this.participants = participants;
		this.professeurs = professeurs;
	}


	/**
	 * @return the idCour
	 */
	public Long getIdCour() {
		return idCour;
	}


	/**
	 * @return the isDispend
	 */
	public boolean isDispend() {
		return isDispend;
	}




	/**
	 * @param isDispend the isDispend to set
	 */
	public void setDispend(boolean isDispend) {
		this.isDispend = isDispend;
	}

	/**
	 * @param idCour the idCour to set
	 */
	public void setIdCour(Long idCour) {
		this.idCour = idCour;
	}



	/**
	 * @return the lieuCour
	 */
	public String getLieuCour() {
		return lieuCour;
	}



	/**
	 * @param lieuCour the lieuCour to set
	 */
	public void setLieuCour(String lieuCour) {
		this.lieuCour = lieuCour;
	}



	/**
	 * @return the langueDispense
	 */
	public Langue getLangueDispense() {
		return langueDispense;
	}



	/**
	 * @param langueDispense the langueDispense to set
	 */
	public void setLangueDispense(Langue langueDispense) {
		this.langueDispense = langueDispense;
	}



	/**
	 * @return the participants
	 */
	public List<Utilisateur> getParticipants() {
		return participants;
	}



	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(List<Utilisateur> participants) {
		this.participants = participants;
	}



	/**
	 * @return the professeurs
	 */
	public Utilisateur getProfesseurs() {
		return professeurs;
	}



	/**
	 * @param professeurs the professeurs to set
	 */
	public void setProfesseurs(Utilisateur professeurs) {
		this.professeurs = professeurs;
	}

	
}
