package miniProjetInterne;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

public class OrganismeFormation {
	private int id;
	private String nom;
	private long numeroSiret;
	private Statut statut;
	
	public OrganismeFormation(int id, String nom, long numeroSiret, Statut status) {
		super();
		this.id = id;
		this.nom = nom;
		this.numeroSiret = numeroSiret;
		this.statut = statut;
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
	 * @return the numeroSiret
	 */
	public long getNumeroSiret() {
		return numeroSiret;
	}

	/**
	 * @param numeroSiret the numeroSiret to set
	 */
	public void setNumeroSiret(long numeroSiret) {
		this.numeroSiret = numeroSiret;
	}

	/**
	 * @return the status
	 */
	public Statut getStatut() {
		return statut;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
		public String getResponsable() {
				return getNom();
	} 

		public void setResponsable() {
			OrganismeFormation.this.setNom(nom);
} 
public List<>
		
}


