public class Lot0
{	
	public static void main (String[] args)
	{
		int x = 10;
		System.out.println(x);
		
		int y = x + 50;
		System.out.println(y);
		
		int z = x * y;
		System.out.println("Le résultat de la multiplication de "+x+" et "+y+" est "+z);
		
		String anto ="Antoine";
		String grizou="Griezmann";
		
		System.out.println(anto+grizou);
		System.out.println(anto+" "+grizou);

		String tortue = "Ninja";
		String tortueBis = "Go";
		
		System.out.println(tortueBis+" "+tortue+" "+tortueBis+" "+tortue+" "+tortueBis);

		String prenom="Nadege";
		String nom = "Lacan";
		Byte age = 37;
		
		System.out.println("Je m'appelle "+prenom+" "+nom+"\n et j'ai "+age+"\n et j'en suis bien contente.");
		//System.out.println("et j'ai "+age);
		//System.out.println("et j'en suis bien contente.");
		
		// grille de morpion initialisation des variables
		byte case1=7;
		byte case2=8;
		byte case3=9;
		byte case4=4;
		byte case5=5;
		byte case6=6;
		byte case7=1;
		byte case8=2;
		byte case9=3;
		
		// affichage de la grille
		System.out.println("|"+case1+"|"+case2+"|"+case3+"|");
		System.out.println("|"+case4+"|"+case5+"|"+case6+"|");
		System.out.println("|"+case7+"|"+case8+"|"+case9+"|");
		
	}
	
}