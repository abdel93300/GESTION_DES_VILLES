package miniProjetInterne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessionFormation 
{
	private int id;
	public Date datedebut;
	public Date datefin;
	public Formation formation;
	private int capacite;
	
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
	 * @return the datedebut
	 */
	public Date getDatedebut() {
		return datedebut;
	}
	
	/**
	 * @param datedebut the datedebut to set
	 */
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	
	/**
	 * @return the datefin
	 */
	public Date getDatefin() {
		return datefin;
	}
	
	/**
	 * @param datefin the datefin to set
	 */
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	/**
	 * @return the formation
	 */
	public Formation getFormation() {
		return formation;
	}
	
	/**
	 * @param formation the formation to set
	 */
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	
	/**
	 * @return the capacite
	 */
	public int getCapacite() {
		return capacite;
	}
	
	
	/**
	 * @param capacite the capacite to set
	 */
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	
	/**
	 * @return the inscrits
	 */
	public List<Personne> getInscrits() {
		return inscrits;
	}
	
	
	/**
	 * @param inscrits the inscrits to set
	 */
	public void setInscrits(List<Personne> inscrits) {
		this.inscrits = inscrits;
	}
	
	
	public SessionFormation(int id, Date datedebut, Date datefin, Formation formation, int capacite,
			List<Personne> inscrits) {
		super();
		this.id = id;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.formation = formation;
		this.capacite = capacite;
		this.inscrits = inscrits;
	}

	
	List<Personne> inscrits = new ArrayList<Personne>();

    // énoncé a) Savoir si une formation est complète
	// on compare la taille de la List <Personne>  des inscrits à la capacité 

public boolean isComplete() {
	return inscrits.size()==capacite;
		
		
}
}
