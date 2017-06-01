package miniProjetInterne;

public class Statut {
	private int id ;
	private String  nom;
	private boolean assujettiTVA;

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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the assujetiTVA
	 */
	public boolean isAssujettiTVA() {
		return assujettiTVA;
	}
 public Statut()
 {
 
 }


	public Statut(int id, String nom, boolean assujettiTVA) {
		super();
		this.id = id;
		this.nom = nom;
		this.assujettiTVA = assujettiTVA;
	}

	public Statut(boolean assujettiTVA) {
		super();
		this.assujettiTVA = assujettiTVA;
	}

	/**
	 * @param assujettiTVA the assujettiTVA to set
	 */
	public void setAssujettiTVA(boolean assujettiTVA) {
		this.assujettiTVA = assujettiTVA;
	}

	
}
