package test4;
import java.io.*;


public class Clavier
{
public static char lireChar()   // Lecture d'un caractère  
	{
		String ligne_lue = null;
		try
		{   InputStreamReader lecteur  = new InputStreamReader(System.in);
			BufferedReader entree = new BufferedReader(lecteur);
			ligne_lue = entree.readLine();
		}
		catch (IOException err)
		{   System.exit(0);	
        }
		return ligne_lue.charAt(0);
	}
public static String lireString()    // Lecture d'une chaîne de caractères      
	{
		String ligne_lue = null;
		try
		{   InputStreamReader lecteur  = new InputStreamReader(System.in);
			BufferedReader entree = new BufferedReader(lecteur);
			ligne_lue = entree.readLine();
		}
		catch (IOException err)
		{   System.exit(0);	
        }
		return ligne_lue;
	}
public static int lireInt()   // Lecture d'un nombre entier
	{
		int n = 0;   // valeur à lire
		try 
		{	String ligne_lue = lireString();
			n=Integer.parseInt(ligne_lue);
		}
		catch (NumberFormatException err)
		{	System.out.println("*** Erreur de donnée ***");
			System.exit(0);
		}
		return n;
	}






public static double lireDouble()   // Lecture d'un nombre à double précision
	{
		double x = 0;   // valeur à lire
		try 
		{	String ligne_lue = lireString();
			x=Double.parseDouble(ligne_lue);
		}
		catch (NumberFormatException err)
		{	System.out.println("*** Erreur de donnée ***");
			System.exit(0);
		}
		return x;
	}
public static float  lireFloat()  // Lecture d'un nombre réel
	{
		float x=0; // valeur à lire
		try 
		{	String ligne_lue=lireString();
			x = Float.parseFloat(ligne_lue);
		}
		catch (NumberFormatException err)
		    {  System.out.println("*** Erreur de donnée ***");
			   System.exit(0);
		    }
		return x;
	}
} 
