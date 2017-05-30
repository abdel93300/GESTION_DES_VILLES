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
		return !estPlusAuNordQue(ville); 
	}
	
	public double calculerDistance(Ville ville) {
		return DistanceLatitudeLongitude.distanceKilometriqueDepuisDegre(
				this.getLatitude(),
				this.getLongitude(),
				ville.getLatitude(),
				ville.getLongitude()
				
				);
	}
	public String villeLaPlusProche(List<Ville> listville) {
			for (Iterator<Ville> l = listville.iterator(); l.hasNext();) {
				Ville ville = (Ville) l.next();
						
				if (DistanceLatitudeLongitude.distanceKilometriqueDepuisDegre(
						this.getLatitude(),
						this.getLongitude(),
						ville.getLatitude(),
						ville.getLongitude()) = 0.) {
					
				}
					
								}
			return nom;
	};
	
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
}