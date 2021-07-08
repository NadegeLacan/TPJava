import java.util.Scanner;
import comAdrar.mesMaths;

public class Lot2 {
    public static void main (String[] args)
    {
        System.out.println(mesMaths.division(20,15));
        /*
        System.out.println(chaineCaractere.stringSansE("j'aime les omelettes sans e"));
        System.out.println(chaineCaractere.stringNbA("j'aime les omelettes sans e"));
        System.out.println(chaineCaractere.chaineInverse("toto titi"));
        System.out.println(chaineCaractere.nbMaj("J'Aime Les Omelettes Sans E"));
        System.out.println(chaineCaractere.supprimeVoyelles("j'aime les omelettes sans e"));
        System.out.println(chaineCaractere.sansMaj("J'Aime Les Omelettes Sans E"));
        System.out.println(chaineCaractere.plusGrandeLettre("j'aime les omelettes sans e"));
        System.out.println(chaineCaractere.enleveSpaceDebut("    j'aime les omelettes sans e   "));
        System.out.println(chaineCaractere.enleveSpaceDF("    j'aime les omelettes sans e   "));
        System.out.println(chaineCaractere.palindrome("totot"));
        System.out.println(chaineCaractere.palindrome("toto"));
        System.out.println(chaineCaractere.textPwd("Toto2135Y"));
        System.out.println(chaineCaractere.textPwd("toto"));



        mesMaths.multiplication(5);
        mesMaths.multiplicationWhile(5);
        mesMaths.multiplicationDoWhile(5);

        Scanner scanInfo=new Scanner(System.in);
        System.out.println("Mineur ou Majeur : Quel est votre age ?");
        boolean majeur=estMajeur(scanInfo.nextInt());
        System.out.println(majeur);

        System.out.println("Positif ou négatif : donner un chiffre ?");
        mesMaths.signe(scanInfo.nextInt());

        System.out.println("Plus grand : saisir un chiffre ?");
        int a = scanInfo.nextInt();
        System.out.println("Plus grand : saisir un 2ème chiffre ?");
        int b = scanInfo.nextInt();
        System.out.println("le plus grand est "+mesMaths.plusGrand2(a,b));

        System.out.println("Plus petit : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("Plus petit : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("le plus petit est "+mesMaths.plusPetit2(a,b));

        System.out.println("Plus petit des 3 : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("Plus petit 3 : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("Plus petit 3 : saisir un 3ème chiffre ?");
        int c = scanInfo.nextInt();
        System.out.println("le plus petit est "+mesMaths.plusPetit3(a,b,c));

        System.out.println("Plus grand des 3 : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("Plus grand 3 : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("Plus grand 3 : saisir un 3ème chiffre ?");
        c = scanInfo.nextInt();
        System.out.println("le plus grand est "+mesMaths.plusGrand3(a,b,c));

        System.out.println("3 positifs ou pas : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("3 positifs ou pas : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("3 positifs ou pas : saisir un 3ème chiffre ?");
        c = scanInfo.nextInt();
        System.out.println("les 3 sont positif "+mesMaths.positifOuPas(a,b,c));

        System.out.println("Quel permis, quel est votre age ?");
        quelPermis(scanInfo.nextInt());

        System.out.println("Quelle capitale : saisir un pays ?");
        System.out.println(capitale(scanInfo.next()));*/
    }

    public static String capitale(String pays)
    {
        String capitale="";

        switch (pays)
        {
            case "France":
                capitale="Paris";
                break;
            case "Allemagne":
                capitale="Berlin";
                break;
            case "Italie":
                capitale="Rome";
                break;
            case "Maroc":
                capitale="Rabat";
                break;
            case "Espagne":
                capitale="Madrid";
                break;
            case "Portugal":
                capitale="Lisbonne";
                break;
            case "Angleterre":
                capitale="Londres";
                break;
            default:
                capitale="Inconnu";
                break;
        }
        return capitale;
    }

    public static void quelPermis(int age)
    {
        if (age<16) System.out.println("Passager d'un véhicule");
        else if (age<18) System.out.println("Eligible conduite accompagnée");
                else System.out.println("Eligible permis B");
    }

    public static boolean estMajeur(int age)
    {
        return age>=18;
    }
}
