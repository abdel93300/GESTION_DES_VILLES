package miniProjetInterne;
import java.util.Scanner;

public class Examples {
	  public static double[] readDoubles(String prompt) {
	  System.out.println(prompt);
	  System.out.println("Combien de valeurs ?");
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println("Entrez les "+ n + " valeurs");
	  double[] res = new double[n] ;
	  for (int i = 0; i != res.length; ++i) {
		   res[i]= sc.nextDouble();
	  }
	  return res;
	}
	  public static void  printArray(double[] arr) {
		    for (int i = 0; i != arr.length; ++i) {
			System.out.println("Position : "+i+" ==> "+(arr[i]));
		}
		 		}	  
  public static String arrayToString(double[] arr) {
	  String message="";
	  for (int i = 0; i != arr.length; ++i) {
		message=arr[i]+"\n";
	}
	  return message;
	}
  
  public static boolean hasLessThan(double[] array, double seuil) {
	 boolean res=false;  
	  for (int i = 0;(i != array.length && !res); ++i) {
		    if (array[i] <seuil) {
		    	res=true;
		    	 	}
	  }
	  return res;
  }
	
  public static double minValue(double[] array) {
	   double res=Double.POSITIVE_INFINITY;  
	    for (int i = 0; i != array.length; ++i) {
	        if (array[i] < res) {
	            res = array[i];
	        }
	    }
	    return res;
	}  
  
  public static double minPos(double[] array) {
	 int pos=-1;
	 double min=Double.POSITIVE_INFINITY;
	    for (int i = 0; i != array.length; ++i) {
	        if (array[i] < min) {
	        	min= array[i];}
	            pos=i;
	       	    }
	    return pos;
	}  
  
 public static double[] lessThanSeuil(double[] array, double seuil) {
	     int nbneg=0;
	    
		  for (int i = 0;i != array.length ; ++i) {
			    if (array[i] <seuil) {
			    	nbneg=nbneg+1;
			    	 	}
		  }
		 double[] tabRes=new double[nbneg];
		 nbneg=0;
		  for (int i = 0;i != array.length ; ++i) {
			    if (array[i] <seuil) {
			    	tabRes[nbneg]=array[i];
			    	 	nbneg++; }
		  }
		  return tabRes;
		 		  }
		
  public static void main(String[] args) {
	  double[] data=readDoubles("Entrez les temp�ratures : ");
	// String msg="";
	 System.out.println("La valeur minimale de la tables est : "+minValue(data));
	 System.out.println("Sa position est : "+minPos(data));
	 System.out.println("Liste des valeurs n�gatives : ");
	 printArray(lessThanSeuil(data,0));
  }

  }





