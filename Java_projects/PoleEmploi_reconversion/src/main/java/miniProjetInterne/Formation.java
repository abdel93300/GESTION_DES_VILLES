package miniProjetInterne;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Formation {
	private int id;
	private OrganismeFormation organisme;
	private int duree;
	private int coutHT;
	Set<String> competencesDeveloppee=new HashSet<String>(); 
	public Formateur formateur;
	static List<Formation> listFormation;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the organisme
	 */
	public OrganismeFormation getOrganisme() {
		return organisme;
	}


	/**
	 * @param organisme the organisme to set
	 */
	public void setOrganisme(OrganismeFormation organisme) {
		this.organisme = organisme;
	}


	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}


	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}


	/**
	 * @return the coutHT
	 */
	public int getCoutHT() {
		return coutHT;
	}


	/**
	 * @param coutHT the coutHT to set
	 */
	public void setCoutHT(int coutHT) {
		this.coutHT = coutHT;
	}


	/**
	 * @return the formateur
	 */
	public Formateur getFormateur() {
		return formateur;
	}


	/**
	 * @param formateur the formateur to set
	 */
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Set<String> getCompetencesDeveloppee() {
		return competencesDeveloppee;
	}

	public Formation(int id, OrganismeFormation organisme, int duree, int coutHT, Set<String> competencesDeveloppee,
			Formateur formateur) {
		super();
		this.id = id;
		this.organisme = organisme;
		this.duree = duree;
		this.coutHT = coutHT;
		this.competencesDeveloppee = competencesDeveloppee;
		this.formateur = formateur;
		// ajout de cet élement à la liste des formations
		listFormation.add(this);
	} 
	// Ennoncé point b) Connaître le prix TTC d’une formation (celui-ci dépendant
	//	si l’organisme est assujeti à la TVA ou non)
	public double coutTTC() {
		double prixttc=this.getCoutHT();
		if (getOrganisme().getStatut().isAssujettiTVA())
		{
			prixttc=prixttc+prixttc*20/100;
			return prixttc;
		}
		else return prixttc;

	}


	/**
	 * @param competencesDeveloppee the competencesDeveloppee to set
	 */
	// point d) de l'énoncé : Pour un centre de formation donné, 
	// listez l’ensemble des compétences enseignées
	public void setCompetences(Set<String> competencesDeveloppee) {
		for (String s : competencesDeveloppee) {
			competencesDeveloppee.add(s);
		}

	}



}