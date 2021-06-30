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
	static int joueurPc=0;
	
	public static void main(String[] arguments) throws InterruptedException
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
				Thread.sleep(1000);
				if (controleGagnant()!=0)
				{
					System.out.println("Bravo joueur"+controleGagnant()+" Vous avez gagné !!!");
					nbTour=9;
				}
			}
			
			System.out.println("Voulez-vous rejouer une partie ? oui/non");
			String encore=scanEncore.next();
			if (encore.equals("non")) jouerEncore=false;
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
		int choix=0;

		switch (joueurPc)
		{
			case 0 :
				choix=choixJoueur();
				break;
			case 1 :
				if (joueur==1) choix=choixJoueur();
				else choix=choixPC();
				break;
			case 2 :
				choix=choixPC();
				break;
		}

		if (choix>0 && choix<10)
		{
			switch (choix)
			{
				case 1 :
					if (c1=='1') c1=remplirCase();
					else casePrise();
					break;
				case 2 : 
					if (c2=='2') c2=remplirCase();
					else casePrise();
					break;
				case 3 : 
					if (c3=='3') c3=remplirCase();
					else casePrise();
					break;
				case 4 : 
					if (c4=='4') c4=remplirCase();
					else casePrise();
					break;
				case 5 : 
					if (c5=='5') c5=remplirCase();
					else casePrise();
					break;			
				case 6 : 
					if (c6=='6') c6=remplirCase();
					else casePrise();
					break;
				case 7 : 
					if (c7=='7') c7=remplirCase();
					else casePrise();
					break;
				case 8 : 
					if (c8=='8') c8=remplirCase();
					else casePrise();
					break;
				case 9 : 
					if (c9=='9') c9=remplirCase();
					else casePrise();
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

	public static int choixJoueur()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Joueur"+joueur+" , choisissez une case entre 1 et 9 :");
		return scan.nextInt();
	}

	public static int choixPC()
	{
		System.out.println("Ordinateur" + joueur + " , choisissez une case entre 1 et 9");
		return (int)Math.floor(1 + (Math.random() * 10));
	}

	public static void casePrise()
	{
		System.out.println("Case déjà prise, veuillez recommencer ");
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
		joueurPc=0;
		System.out.println("Bonjour et bienvenu dans votre jeu de Morpion");
		Scanner scanPC=new Scanner(System.in);
		System.out.println("Voulez-vous jouer contre un pc ? oui/non");
		String playPC=scanPC.next();
		if (playPC.equals("oui"))
		{
			System.out.println("Voulez-vous faire jouer 2 pc ensemble ? oui/non");
			playPC=scanPC.next();
			if (playPC.equals("oui")) joueurPc = 2;
			else joueurPc=1;
		}
	}
}