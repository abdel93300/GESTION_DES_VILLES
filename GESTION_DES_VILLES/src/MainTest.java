import java.util.*;

public class MainTest
{
	public static void main(String[] args)
	{
		Ville paris      = new Ville("Paris"     , 48.856614, 2.3522219);
		Ville brest      = new Ville("Brest"     , 48.4084597,-4.5347058);
		Ville lille      = new Ville("Lille"     , 50.6311167,3.0120553);
		Ville strasbourg = new Ville("Strasbourg", 48.5692058,7.6918829);
		Ville nice       = new Ville("Nice"      , 43.7031654,7.1827232);
		Ville marseille  = new Ville("Marseille" , 43.2804941,5.3349277);
		Ville biarritz   = new Ville("Biarritz"  , 43.4710109,-1.573345);
		Ville rioDeJaneiro   = new Ville("Rio de Janeiro",  
				-22.9108555,-43.5887609);
		System.out.println("1 : "+paris.estDansLHemisphrerNord());
		System.out.println("2 : "+paris.estPlusALOuest(brest));
		System.out.println("3 : "+paris.estPlusALEst(brest));
		System.out.println("4 : "+paris.calculerDistance(marseille));
		System.out.println("4-1 biarritz/brest : "+brest.calculerDistance(biarritz));
		System.out.println("4-2 biarritz/strasbourg : "+strasbourg.calculerDistance(biarritz));

		/*  Set<Ville> setVille = new HashSet();
   setVille.add( new Ville("Paris"     , 48.856614, 2.3522219) );
   setVille.add( new Ville("Brest"     , 48.4084597,-4.5347058) );
   setVille.add( new Ville("Paris"     , 48.856614, 2.3522219) );
   System.out.println(setVille);*/
		List<Ville> listDeVille = new ArrayList<Ville>();
		listDeVille=Arrays.asList(paris,brest,lille,strasbourg,nice,rioDeJaneiro);
		System.out.println("5 : "+Arrays.deepToString(Ville.matrixDistance(listDeVille)).replaceAll("\\], \\[", "],\n [")) ;
		System.out.println("6 : la ville la plus proche de Biarritz est : "+biarritz.villeLaPlusProche(listDeVille).getNom());
		System.out.println("7 : la ville la plus loin de Biarritz est   : "+biarritz.villeLaPlusEloignee(listDeVille).getNom()); 
		int j=0;
		for (Ville ville : listDeVille) {
			j=j+1;
			System.out.println("8."+j+" : élément "+j+"  de la liste de ville  : "+ville.getNom()); 
			
		} 
		
	}
}


