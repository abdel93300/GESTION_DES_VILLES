import java.util.List;
import java.util.Iterator;

public class Ville {
	private String nom;
	private double longitude;
	private double latitude;

	public Ville(String nom, double latitude, double longitude) {
		super();
		this.nom = nom;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public boolean estDansLHemisphrerNord() {
		return latitude>0;
	}

	public boolean estPlusAuNordQue (Ville ville) {
		return this.latitude > ville.getLatitude(); 
	}

	public boolean estPlusALEst (Ville ville) {
		return this.longitude > ville.getLongitude(); 
	}
	public boolean estPlusALOuest (Ville ville) {
		return !this.estPlusALEst(ville); 
	}
	public boolean estPlusAuSud (Ville ville) {
		return !this.estPlusAuNordQue(ville); 
	}

	public double calculerDistance(Ville ville) {
		return DistanceLatitudeLongitude.distanceKilometriqueDepuisDegre(
				this.getLatitude(),
				this.getLongitude(),
				ville.getLatitude(),
				ville.getLongitude()

				);
	}
	/*
	 * Boucle sur la liste des villes
	 *    boucle sur la même liste de ville
	 *    calcul
	 */	
	// recherche de la ville la plus proche
	// au départ on instancie la villeDistanceMin
	// à partir de la distance de la 1ère ville 
	// si on trouve une distance < on la stocke et ainsi de suIte ...
	public Ville villeLaPlusProche(List<Ville> listVille) {
		Ville villeDistanceMin = listVille.get(0);
		for (Ville ville : listVille) {
			if (calculerDistance(ville)<calculerDistance(villeDistanceMin))
			{ 
				villeDistanceMin =ville;
			}
		}
		return villeDistanceMin;
	}
	public Ville villeLaPlusEloignee(List<Ville> listVille) {

		Ville villeDistanceMax= listVille.get(0);
		for (Ville ville : listVille) {
			if (calculerDistance(ville)>calculerDistance(villeDistanceMax))
			{ 
				villeDistanceMax =ville;
			}
		}
		return villeDistanceMax;
	}
	// création d'une table à 2D contenant les distances à partir d'une liste
	// de ville 
	//	
	public static double [][] matrixDistance(List<Ville> listVille){
		double matrixDist [][]=new double[listVille.size()] [listVille.size()] ;
		for (int i = 0; i != listVille.size(); ++i) {
			for (int j = 0; j != listVille.size(); ++j) {
				matrixDist[i][j]= listVille.get(i).calculerDistance(listVille.get(j));
			}
			matrixDist[i][i] = 0;
		}
		return  matrixDist;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/*	@Override
	public int hashCode() {
		return nom.hashCode();
	}

		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}*/
}