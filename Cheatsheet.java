//commentaires
/*commentaires
plusieurs lignes*/

public class Cheatsheet
{	
	public static void main (String[] args)
	{
		System.out.println("Hello ADRAR World"); //avec retour à la ligne
		int x=5; //declaration entier
		float y=2.5f; 
		double z=9.5123;
		double pi; // declaration sans valeur
		pi=3.14159;
		boolean suisJeMoi = true; // false
		char lettre = 'n';
		System.out.print("bonjour"); //sans retour à la ligne
		System.out.print("\n"); // retour chariot
		
		// affichage de nos variables
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(suisJeMoi);
		System.out.println(lettre);
		
		float resultat = x + y;
		System.out.println(resultat);
		
		x = x + (int)y;
		System.out.println(x);
		
		x=5;
		System.out.println(x);
		
		z=z-1;
		z-=1;
		z--;
		--z;
		System.out.println(z);
		// final permet de ne plus pouvoir changer la valeur, c'est une constante
		// la constante est en majuscule
		final float PI=3.1415f; 
		System.out.println(PI);
		
		String maChaine = "enfin du text";
		System.out.println(maChaine);
		
		String maChaineCorrigee = maChaine + "e";
		System.out.println(maChaineCorrigee);
		
		double random = Math.random()*10;
		System.out.println(random);
		int randomInt = 1+ (int)Math.floor(0.5+Math.random()*11);
		System.out.println(randomInt);		
		
		bonjour();
		
	}
	
	public static void bonjour()
	{
		int uneAutreVariable=10;
		System.out.println("bonjour");
	}
}
