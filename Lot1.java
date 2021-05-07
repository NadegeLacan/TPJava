public class Lot1
{	
	public static void main (String[] args)
	{
		String resultat=HelloWord();
		System.out.println(resultat);
		
		resultat=quiEstLeMeilleurProf();
		System.out.println(resultat);
		
		resultat=jeRetourneMonArgument("123");
		System.out.println(resultat);
		
		resultat=concatenation("Antoine","Griezman");
		System.out.println(resultat);
		
		resultat=concatenationAvecEspace("Ngolo","Kante");
		System.out.println(resultat);
		
		afficher("Fonction afficher du texte");
		
		int x = 5;
		int y = 5;
		System.out.println(somme(x,y));
		System.out.println(soustraction(x,y));
		System.out.println(multiplication(x,y));
		
		System.out.println(calculTTC(10));
		
		afficherPlatDuJour("oeufs mimosas",3,"entrecôte frites",10,"banoffee",5);
		
		System.out.println(mentionBachelier(0.85));
	}
	
	public static String HelloWord()
	{
		String texteRetour="Hello ADRAR World!";
		return texteRetour;
	}
	
	public static String quiEstLeMeilleurProf()
	{
		String texteRetour="Le prof de programmation JAVA";
		return texteRetour;
	}
	
	public static String jeRetourneMonArgument(String arg)
	{
		String texteRetour=arg;
		return texteRetour;
	}
	
	public static String concatenation(String arg1, String arg2)
	{
		String texteRetour=arg1+arg2;
		return texteRetour;
	}
	
	public static String concatenationAvecEspace(String arg1, String arg2)
	{
		String texteRetour=arg1+" "+arg2;
		return texteRetour;
	}
	
	public static void afficher(String arg)
	{
		System.out.println(arg);
	}
	
	public static int somme(int arg1, int arg2)
	{
		int resultat = arg1+arg2;
		return resultat;
	}
	
	public static int soustraction(int arg1, int arg2)
	{
		int resultat = arg1-arg2;
		return resultat;
	}
	
	public static int multiplication(int arg1, int arg2)
	{
		int resultat = arg1*arg2;
		return resultat;
	}
	
	public static float calculTTC(float prixHT)
	{
		float TVA = 0.055f;
		float resultat = prixHT + (prixHT*TVA);
		return resultat;
	}
	
	public static void afficherPlatDuJour(String entree, float entreeHT, String plat, float platHT, String dessert, float dessertHT)
	{
		float entreTTC = calculTTC(entreeHT);
		float platTTC = calculTTC(platHT);
		float dessertTTC = calculTTC(dessertHT);
	
		System.out.println("Le chef vous propose aujourd'hui : ");
		System.out.print("- Entrée : " + entree + "(" + entreTTC + "€) \n");
		System.out.print("- Plat : " + plat + "(" + platTTC + "€) \n");
		System.out.print("- Dessert : " + dessert + "(" + dessertTTC + "€) \n");
		System.out.println("Nous remercions notre aimable clientèle par avance de vouloir régler en bitcoin");
	}
	
	public static String mentionBachelier(double note)
	{
		String mention;
		if (note<0.5)
		{
			mention = "pas réussi";
		}
		else 
		{
			if (note<0.6)
			{
				mention="réussi";
			}
			else
			{ 
				if (note<0.7)
				{
					mention="satisfaction";
				}
				else
				{
					if (note<0.8)
					{
						mention="distinction";
					}
					else 
					{
						if (note<0.9)
						{
							mention="une grande distinction";
						}
						else
						{
							mention="la plus grande distinction";
						}
					}	
				}
			}
		}
		return mention;
	}
}