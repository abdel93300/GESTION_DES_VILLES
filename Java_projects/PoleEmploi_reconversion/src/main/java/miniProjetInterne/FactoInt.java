package miniProjetInterne;
import java.util.Scanner;

import jdk.internal.dynalink.beans.StaticClass;

public class FactoInt {
public static void main(String args[]) {
	Scanner entree = new Scanner(System.in);
	int n;
    char mode=' ';
    System.out.println("CALCULATEUR FACTORIEL ET SUMTORIEL");
    System.out.println("----------------------------------");
    do{//tant que reponse n'est pas 1 ou 2
        mode = ' ';
        System.out.println("Entrez le type de calcul :  ");
        System.out.println("1 - Calcul du Factotiel ");
   	    System.out.println("2 - Calcul du SumToriel "); 
        mode = entree.nextLine().charAt(0);
        if(mode != '1' && mode != '2')
          System.out.println("Mode inconnu, veuillez r�it�rer votre choix.");
      }while (mode != '1' && mode != '2');
    System.out.println("Entrez un Entier : ");
    n = entree.nextInt();
    //Pensez � vider la ligne lue
    entree.nextLine();
  //Selon le mode, on calcule diff�remment et on affiche le r�sultat

    if(mode == '1'){
      System.out.println("le r�sultat du factoriel "+n+" est : "+factoriel(n));
    }
    else{
    	System.out.println("le r�sultat du sumtoriel "+n+" est : "+sumtoriel(n));    
    }
}
   
    static int factoriel(int n) {
    	if(n==0 || n==1){
    		return 1;
    	} else {
    		return n* factoriel(n-1);
    	}
    }
  
    static int sumtoriel(int n) {
	if(n==1){
		return 1;
	} else {
		return n+ sumtoriel(n-1);
	}
	
}
}
