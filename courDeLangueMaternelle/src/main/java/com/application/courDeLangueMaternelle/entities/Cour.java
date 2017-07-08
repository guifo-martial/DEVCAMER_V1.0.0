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
public class Cour implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6747491684129358910L;
	
	private Long idCour;
	private String lieuCour;
	private Langue langueDispense;
	private List<Participant> participants;
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
	public Cour(String lieuCour, Langue langueDispense, List<Participant> participants, List<Utilisateur> professeurs) {
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
	public List<Participant> getParticipants() {
		return participants;
	}



	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}



	/**
	 * @return the professeurs
	 */
	public List<Utilisateur> getProfesseurs() {
		return professeurs;
	}



	/**
	 * @param professeurs the professeurs to set
	 */
	public void setProfesseurs(List<Utilisateur> professeurs) {
		this.professeurs = professeurs;
	}

	
}
