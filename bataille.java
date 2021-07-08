import java.util.Scanner;

public class bataille
{
    static int [] tabCarteJoueur1;
    static int [] tabCarteJoueur2;

    public static void main (String args[]) throws InterruptedException
    {
        // initialisation du jeux
        initCartes();
        jeu();
    }

    public static void initCartes()
    {
        tabCarteJoueur1 = new int[26];
        tabCarteJoueur2=new int[26];

        for (int i=1; i<=13; i++)
        {
            tabCarteJoueur1[i-1]=i;
            tabCarteJoueur2[i-1]=i;
        }
    }

    public static int tirerUneCarte(int numJoueur)
    {
        int carte, rand;

        if (numJoueur==1)
        {
            do {
                rand = (int) Math.floor(0 + (Math.random() * 25));
                carte = tabCarteJoueur1[rand];
            } while (carte == 0);
            tabCarteJoueur1[rand] = 0;
        }
        else
        {
            do {
                rand = (int) Math.floor(0 + (Math.random() * 25));
                carte = tabCarteJoueur2[rand];
            } while (carte == 0);
            tabCarteJoueur2[rand] = 0;
        }
        return carte;
    }

    public static int quiGagneLeTour(int carte1, int carte2)
    {
        if (carte1==carte2)
            return 0;

        if (carte1>carte2)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public static void transfererCarte(int gagnant, int carte1, int carte2)
    {
        int i=0;
        if (gagnant==1)
        {
            while (tabCarteJoueur1[i]!=0)
            {
                i++;
            }
            tabCarteJoueur1[i]=carte1;
            while (tabCarteJoueur1[i]!=0)
            {
                i++;
            }
            tabCarteJoueur1[i]=carte2;
        }
        else
        {
            while (tabCarteJoueur2[i]!=0)
            {
                i++;
            }
            tabCarteJoueur2[i]=carte1;
            while (tabCarteJoueur2[i]!=0)
            {
                i++;
            }
            tabCarteJoueur2[i]=carte2;
        }
    }

    public static void afficherTour(int gagnant, int carte1, int carte2)
    {
        String txt, txt2;

        switch (carte1)
        {
            case 1:
                txt = "l'as";
                break;
            case 11:
                txt = "le valet";
                break;
            case 12:
                txt = "la dame";
                break;
            case 13:
                txt = "le roi";
                break;
            default:
                txt = "le " + carte1;
                break;
        }

        switch (carte2)
        {
            case 1 : txt2="l'as";
                break;
            case 11 : txt2="le valet";
                break;
            case 12 : txt2="la dame";
                break;
            case 13 : txt2="le roi";
                break;
            default : txt2="le "+carte2;
                break;
        }

        if (gagnant==1)
        {
            System.out.println("le joueur 1 a gagné avec "+txt+" le joueur 2 qui avait "+txt2);
        }
        else if (gagnant==2)
        {
            System.out.println("le joueur 2 a gagné avec "+txt2+" le joueur 1 qui avait "+txt);
        }
        else
        {
            System.out.println("Egalité : "+txt+" du joueur 1 et 2 sont retirées du jeu !");
        }

        System.out.println("le joueur 1 a encore "+NbCartesJ1()+" cartes en main");
        System.out.println("le joueur 2 a encore "+NbCartesJ2()+" cartes en main");
    }

    public static int NbCartesJ1()
    {
        int nbCarteJ1=0;
        for (int i=0; i<26;i++)
        {
            if (tabCarteJoueur1[i]!=0)
            {
                nbCarteJ1++;
            }
        }
        return nbCarteJ1;
    }

    public static int NbCartesJ2()
    {
        int nbCarteJ2=0;
        for (int i=0; i<26;i++)
        {
            if (tabCarteJoueur2[i]!=0)
            {
                nbCarteJ2++;
            }
        }
        return nbCarteJ2;
    }

    public static void jeu() throws InterruptedException
    {
        int carteJ1;
        int carteJ2;
        int gagnant;
        String J1, J2;

        double debut= System.currentTimeMillis();

        Scanner scan = new Scanner(System.in);
        System.out.println("Joueur1 , quel est votre nom ?");
        J1=scan.next();
        System.out.println("Joueur2 , quel est votre nom ?");
        J2=scan.next();

        do
        {
            carteJ1=tirerUneCarte(1);
            carteJ2=tirerUneCarte(2);
            gagnant=quiGagneLeTour(carteJ1,carteJ2);
            if (gagnant!=0)
            {
                transfererCarte(gagnant,carteJ1,carteJ2);
            }
            afficherTour(gagnant,carteJ1,carteJ2);
            Thread.sleep(500L);
        } while ((NbCartesJ2()!=0) && (NbCartesJ1()!=0));

        if ((NbCartesJ1()==0) && (NbCartesJ2()==0))
        {
            System.out.println("Egalité");
        }
        else if (NbCartesJ1()==0)
        {
            System.out.println("Le joueur "+J1+" gagne!!! Bravo");
        }
        else if (NbCartesJ2()==0)
        {
            System.out.println("Le joueur "+J2+" gagne!!! Bravo");
        }

        double fin = (System.currentTimeMillis()-debut)/1000;
        System.out.println("la partie a durée : "+ fin+" secondes");
    }
}
