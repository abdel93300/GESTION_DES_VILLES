package miniProjetInterne;

import java.util.HashSet;
import java.util.Set;
public class PersonneEnReconversion extends Personne {

	public PersonneEnReconversion() {
		super();

	}
	
	public PersonneEnReconversion(int id, long numeroDeSecuriteSociale, String nom, String prenom) {
		super(id, numeroDeSecuriteSociale, nom, prenom);
	}
	
	Set<String> expertise=new HashSet<String>();
	
	/**
	 * @return the competencesEnDeveloppement
	 */
	public Set<String> getExpertise() {
		return expertise;
	}
	
	public PersonneEnReconversion(int id) {
		super(id);
	}
	public void setCompetences (String expertise) {
		for (String s : expertise.split(" ")) {
			getExpertise().add(s); 
		}
	}
	
}

