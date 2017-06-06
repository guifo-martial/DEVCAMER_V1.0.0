/**
 * 
 */
package com.application.courDeLangueMaternelle.entities;

import java.util.List;

/**
 * @author guifo
 *
 */
public class Participant extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 266294713435298139L;

	/**
	 * 
	 */
	private boolean isPresent;
	
	

	public Participant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param roles
	 */
	public Participant(String nom, String prenom, String mail, List<Roles> roles) {
		super(nom, prenom, mail, roles);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the isPresent
	 */
	public boolean isPresent() {
		return isPresent;
	}

	/**
	 * @param isPresent the isPresent to set
	 */
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	

}
