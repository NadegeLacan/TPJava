import javax.swing.*;

public class chaineCaractere {

    public static void main (String[] args)
    {
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
    }

    public static boolean textPwd(String pwd)
    {
        if (pwd.length()<8)
            return false;
        if (nbMaj(pwd)<1)
            return false;
        if (nbMin(pwd)<1)
            return false;
        if (nbChiffre(pwd)<1)
            return false;
        return true;
    }

    public static int nbChiffre(String texte)
    {
        int nb=0;
        char c;
        for (int i=0;i<texte.length();i++)
        {
            c=texte.charAt(i);
            if ((c=='0') || (c=='1') || (c=='2') || (c=='3') || (c=='4') || (c=='5') || (c=='6') || (c=='7') || (c=='8') || (c=='9'))
                nb++;
        }
        return nb;
    }

    public static int nbMin(String texte)
    {
        int nb=0;
        for (int i=0;i<texte.length();i++)
        {
            if (!Character.isUpperCase(texte.charAt(i)))
                nb++;
        }
        return nb;
    }

    public static boolean palindrome(String texte)
    {
        if (texte.equals(chaineInverse(texte)))
            return true;
        else
            return false;
    }

    public static String enleveSpaceDF(String texte)
    {
        String txt=enleveSpaceDebut(texte);
        boolean lettreTrouve=false;
        String txt2="";

        for (int i=txt.length()-1; i>=0; i--)
        {
            if (txt.charAt(i)!=' ')
            {
                txt2 = txt2 + txt.charAt(i);
                lettreTrouve = true;
            }
            else if (lettreTrouve)
                txt2 = txt2 + txt.charAt(i);
        }
        return chaineInverse(txt2);
    }

    public static String enleveSpaceDebut(String texte)
    {
        String txt="";
        boolean lettreTrouve=false;
        for (int i=0;i<texte.length();i++)
        {
            if (texte.charAt(i)!=' ')
            {
                txt = txt + texte.charAt(i);
                lettreTrouve = true;
            }
            else if (lettreTrouve)
                txt = txt + texte.charAt(i);
        }
        return txt;
    }

    public static char plusGrandeLettre(String texte)
    {
        char plusGrand=texte.charAt(0);
        for (int i=1;i<texte.length();i++)
        {
            if (texte.charAt(i)>plusGrand)
                plusGrand=texte.charAt(i);
        }
        return plusGrand;
    }

    public static String sansMaj(String texte)
    {
        String txt="";
        for (int i=0;i<texte.length();i++)
        {
            if (!Character.isUpperCase(texte.charAt(i)))
                txt=txt+texte.charAt(i);
        }
        return txt;
    }

    public static String supprimeVoyelles(String texte)
    {
        String txt="";

        for (int i=0;i<texte.length();i++)
        {
            switch (texte.charAt(i))
            {
                case 'a' : break;
                case 'e' : break;
                case 'i' : break;
                case 'o' : break;
                case 'u' : break;
                case 'y' : break;
                default:
                    txt=txt+texte.charAt(i);
                    break;
            }
        }
        return txt;
    }

    public static int nbMaj(String texte)
    {
        int nb=0;
        for (int i=0;i<texte.length();i++)
        {
            if (Character.isUpperCase(texte.charAt(i)))
                nb++;
        }
        return nb;
    }

    public static String chaineInverse(String txt)
    {
        String texteInverse="";
        int i=txt.length()-1;
        while (i>=0)
        {
            texteInverse=texteInverse + txt.charAt(i);
            i--;
        }
        return texteInverse;
    }

    public static int stringNbA(String texte)
    {
        int nbA=0;
        for (int i=0;i<texte.length();i++)
        {
            if ((texte.charAt(i)=='a') || (texte.charAt(i)=='A'))
                nbA++;
        }
        return nbA;
    }

    public static String stringSansE(String texte)
    {
        String texteSansE="";
        for (int i=0;i<texte.length();i++)
        {
            if ((texte.charAt(i)!='e') && (texte.charAt(i)!='E'))
                texteSansE+=texte.charAt(i);
        }
        return texteSansE;
    }
}
