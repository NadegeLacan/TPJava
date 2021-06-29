import java.util.Scanner;

public class Morpion
{
	static char c1='1';
 	static char c2='2';
	static char c3='3';
 	static char c4='4';
	static char c5='5';
	static char c6='6';
	static char c7='7';
	static char c8='8';	
	static char c9='9';
	static int joueur=1;
	static int nbTour=0;
	
	public static void main(String[] arguments)
	{
		boolean jouerEncore=true;
		Scanner scanEncore=new Scanner(System.in);
	
		while (jouerEncore==true)
		{
			reset();
			afficherGrille();	
			while (nbTour<9)
			{
				jouerUnTour();
				afficherGrille();
				if (controleGagnant()!=0)
				{
					System.out.println("Bravo joueur"+controleGagnant()+" Vous avez gagné !!!");
					nbTour=9;
				}
			}
			
			System.out.println("Voulez-vous rejouer une partie ? oui/non");
			String encore=scanEncore.next();
			System.out.println(encore+"123");
			if (encore=="non") jouerEncore=false;
		}
	}
	
	public static void afficherGrille()
	{
		System.out.println("|"+c7+"|"+c8+"|"+c9+"|");
		System.out.println("|"+c4+"|"+c5+"|"+c6+"|");
		System.out.println("|"+c1+"|"+c2+"|"+c3+"|");	
	}
	
	public static void jouerUnTour()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Joueur"+joueur+" , choisissez une case entre 1 et 9 :");
		int choix=scan.nextInt();
		
		if (choix>0 && choix<10)
		{
			switch (choix)
			{
				case 1 :
					if (c1=='1') 
						c1=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 2 : 
					if (c2=='2') 
						c2=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 3 : 
					if (c3=='3') 
						c3=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 4 : 
					if (c4=='4') 
						c4=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 5 : 
					if (c5=='5') 
						c5=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;			
				case 6 : 
					if (c6=='6') 
						c6=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 7 : 
					if (c7=='7') 
						c7=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 8 : 
					if (c8=='8') 
						c8=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				case 9 : 
					if (c9=='9') 
						c9=remplirCase();
					else 
						System.out.println("Case déjà prise, veuillez recommencer ");
					break;
				default :
					System.out.println("Erreur de choix, veuillez recommencer ");
					break;
			}
		}
		else System.out.println("Valeur impossible, tu triches!!!");
	}
	
	public static int controleGagnant()
	{
		if ((c1==c2) && (c1==c3)) return quiGagne(c1); 
		if ((c4==c5) && (c4==c6)) return quiGagne(c4);
		if ((c7==c8) && (c7==c9)) return quiGagne(c7);
		if ((c1==c4) && (c1==c7)) return quiGagne(c1);
		if ((c2==c5) && (c2==c8)) return quiGagne(c2);
		if ((c3==c6) && (c3==c9)) return quiGagne(c3);
		if ((c1==c5) && (c1==c9)) return quiGagne(c1);
		if ((c3==c5) && (c3==c7)) return quiGagne(c3);	
		return 0;
	}
	
	public static int quiGagne(char valeurCase)
	{
		if (valeurCase=='X') return 1; 
		if (valeurCase=='O') return 2;
		
		return 0;
	}
	
	public static char remplirCase()
	{
		char valeur;
		nbTour++;
		if (joueur==1)
		{
			valeur='X';
			joueur=2;
		}
		else
		{
			valeur='O';
			joueur=1;
		}
		return valeur;
	}
	
	public static void reset()
	{
		c1='1';
		c2='2';
		c3='3';
		c4='4';
		c5='5';
		c6='6';
		c7='7';
		c8='8';	
		c9='9';
		joueur=1;
		nbTour=0;
		System.out.println("Bonjour et bienvenu dans votre jeu de Morpion");
	}
}