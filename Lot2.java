import java.util.Scanner;

public class Lot2 {
    public static void main (String[] args)
    {
        Scanner scanInfo=new Scanner(System.in);
        System.out.println("Mineur ou Majeur : Quel est votre age ?");
        boolean majeur=estMajeur(scanInfo.nextInt());
        System.out.println(majeur);

        System.out.println("Positif ou négatif : donner un chiffre ?");
        signe(scanInfo.nextInt());

        System.out.println("Plus grand : saisir un chiffre ?");
        int a = scanInfo.nextInt();
        System.out.println("Plus grand : saisir un 2ème chiffre ?");
        int b = scanInfo.nextInt();
        System.out.println("le plus grand est "+plusGrand2(a,b));

        System.out.println("Plus petit : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("Plus petit : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("le plus petit est "+plusPetit2(a,b));

        System.out.println("Plus petit des 3 : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("Plus petit 3 : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("Plus petit 3 : saisir un 3ème chiffre ?");
        int c = scanInfo.nextInt();
        System.out.println("le plus petit est "+plusPetit3(a,b,c));

        System.out.println("Plus grand des 3 : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("Plus grand 3 : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("Plus grand 3 : saisir un 3ème chiffre ?");
        c = scanInfo.nextInt();
        System.out.println("le plus grand est "+plusGrand3(a,b,c));

        System.out.println("3 positifs ou pas : saisir un chiffre ?");
        a = scanInfo.nextInt();
        System.out.println("3 positifs ou pas : saisir un 2ème chiffre ?");
        b = scanInfo.nextInt();
        System.out.println("3 positifs ou pas : saisir un 3ème chiffre ?");
        c = scanInfo.nextInt();
        System.out.println("les 3 sont positif "+positifOuPas(a,b,c));

        System.out.println("Quel permis, quel est votre age ?");
        quelPermis(scanInfo.nextInt());

        System.out.println("Quelle capitale : saisir un pays ?");
        System.out.println(capitale(scanInfo.next()));
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

    public static boolean positifOuPas(float x, float y, float z)
    {
        if ((x>0) && (y>0) && (z>0)) return true;
        else return false;
    }

    public static int plusGrand3(int x, int y, int z)
    {
        if ((x>y) && (x>z)) return x;
        else if ((y>x) && (y>z)) return y;
        else return z;
    }

    public static int plusPetit3(int x, int y, int z)
    {
        if ((x<y) && (x<z)) return x;
        else if ((y<x) && (y<z)) return y;
        else return z;
    }

    public static int plusPetit2(int x, int y)
    {
        if (x<y) return x;
        else return y;
    }

    public static int plusGrand2(int x, int y)
    {
        if (x>y) return x;
        else return y;
    }

    public static void signe(float x)
    {
        if (x<0) System.out.println("négatif");
        else if (x>0) System.out.println("positif");
        else System.out.println("nul");
    }

    public static boolean estMajeur(int age)
    {
        if (age>=18) return true;
        else return false;
    }
}
