package miniProjetInterne;
import java.io.FileReader;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class ExampleReadFile{
    private static final String Scanner = null;
	public static ArrayList<String> readNames(String filename) throws FileNotFoundException, IOException {
                  
        URL url= new URL(filename);
        ArrayList<String> res= new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
                for(String line = br.readLine(); line != null; line= br.readLine()){
                      res.add(line); }
                           }
          return res;
    }
    
    public static void  printArray(String[] arr) {
	    for (int i = 0; i != arr.length; ++i) {
		System.out.println("Position : "+i+" ==> "+(arr[i]));
	}
    }	    
    public static void  printArrayList(ArrayList<String> arr) {
	       	 for (int i = 0; i !=arr.size(); i++) {
	       		System.out.println("Valeur pos. : "+i+" = "+ arr.get(i));
			}
	    	
	}
    public static void  printHashSet(HashSet<String> hset) {
      	 for (String val : hset) {
      		System.out.println("HashSet : " +hset);
		}
   	
}

	public static ArrayList<String> intersection(ArrayList<String> names1, ArrayList<String> names2)
    {
       HashSet<String> set1=new HashSet<String>();
       HashSet<String> set2=new HashSet<String>();
      	for (int i = 0 ;i !=names1.size(); ++i) 
    	{set1.add(names1.get(i));
	        	for (i = 0; i != names2.size(); ++i)
        	{
        		if(set1.contains(names2.get(i)))
        		{  set2.add(names2.get(i));	
        		System.out.println("Station en commun :"+names2.get(i));
        		}
        		
		    }
        	
      }
        ArrayList<String> tab  = new ArrayList<String>(set2);
    //	tab= set2.toArray();
	   	return  tab;
   
}
    /*
    public static String mostCommon(ArrayList<String> array){
    	  HashMap<String, Integer> tmp=new HashMap<String, Integer>();
        for (i=0;
			
		}
			
		}//    return res;
    }*/

    public static void main(String[]  args){
        //System.out.println("R�pertoire courant = " + System.getProperty("user.dir"));
        try{
            ArrayList<String> names1= readNames("https://raw.githubusercontent.com/bhugueney/II.2407/master/docs/Data/liste-des-gares-1.txt");
            ArrayList<String> names2= readNames("https://raw.githubusercontent.com/bhugueney/II.2407/master/docs/Data/liste-des-gares-2.txt");
          System.out.println("Names1 : ");
            printArrayList(names1);
            System.out.println("Taille table Names1 " + names1.size());
            System.out.println("Names2 : ");
            printArrayList(names2);
            System.out.println("Taille table Names2 " + names2.size());
            ArrayList<String> names1and2= intersection(names1, names2);
            System.out.println("R�sultat de l'intersection : ");
            printArrayList(names1and2);
          
       //  String mostCommonName1= mostCommon(names1);*/
        }catch(FileNotFoundException e){
            System.err.println(e);
        }
        catch(IOException e){
            System.err.println(e);
        }
        catch(NullPointerException e){
            System.err.println(e);
        }
    }
}
