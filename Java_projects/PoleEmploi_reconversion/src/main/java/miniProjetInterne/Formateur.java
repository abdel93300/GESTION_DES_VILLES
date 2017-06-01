package miniProjetInterne;

import java.util.HashSet;
import java.util.Set;
public class Formateur extends Personne {
	public Formateur() {
		super();
	}


	public Formateur(int id, long numeroDeSecuriteSociale, String nom, String prenom) {
		super(id, numeroDeSecuriteSociale, nom, prenom);
	}

	Set<String> competencesEnDeveloppement=new HashSet<String>();

	/**
	 * @return the competencesEnDeveloppement
	 */
	public Set<String> getCompetencesEnDeveloppement() {
		return competencesEnDeveloppement;
	}

	public void setCompetences (String competences) {
		for (String s : competences.split(",")) {
			getCompetencesEnDeveloppement().add(s); 
		}
	}
	
	public Formateur(int id) {
		super(id);
	}
}
