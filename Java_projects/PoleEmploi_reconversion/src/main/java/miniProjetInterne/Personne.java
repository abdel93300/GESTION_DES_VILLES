package miniProjetInterne;

public class Personne {
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	
	private long numeroDeSecuriteSociale;
	private String nom;
	private String prenom;
	public Personne(int id)
	{
		this.id=id;
	}
	
	public Personne(int id, long numeroDeSecuriteSociale, String nom, String prenom) {
		super();
		this.id = id;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		this.nom = nom;
		this.prenom = prenom;
	}
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
	 * @return the numeroDeSecuriteSociale
	 */
	public long getNumeroSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}
	/**
	 * @param numeroDeSecuriteSociale the numeroDeSecuriteSociale to set
	 */
	public void setNumeroSecuriteSociale(long numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
