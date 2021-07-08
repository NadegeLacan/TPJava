import java.util.Arrays;

public class tableaux {
    public static void main (String args[])
    {
        int [] tab;
        tab=new int[20];
        int [] tab2;
        tab2=new int[20];
        fillTab(tab);
        fillTab(tab2);
        printTab(tab);
        System.out.println(getMax(tab));
        permute(tab,5,15);
        printTab(tab);
        System.out.println(somme(tab));
        System.out.println(moyenne(tab));
        afficheSupMoyenne(tab);
        System.out.println(nbMaxi(tab));
        printTab(fusion(tab,tab2));
        add(tab,101);
        printTab(tab);
        remove(tab,0);
        printTab(tab);
    }

    public static void fillTab(int[] tab)
    {
        for (int i=0;i<tab.length;i++)
        {
            tab[i]=(int) Math.floor(0 + (Math.random() * 99));
        }
    }

    public static void printTab(int[] tab)
    {
        System.out.println(Arrays.toString(tab));
    }

    public static int getMax(int[] tab)
    {
        int max=tab[0];
        for (int i=0;i<tab.length;i++)
        {
            if (tab[i]>max)
                max=tab[i];
        }
        return max;
    }

    public static void permute(int[] tab, int i, int j)
    {
        int nb1=tab[i];
        int nb2=tab[j];

        tab[j]=nb1;
        tab[i]=nb2;
    }

    public static int somme(int[] tab)
    {
        int total=0;
        for (int i=0;i<tab.length;i++)
        {
            total+=tab[i];
        }
        return total;
    }

    public static int moyenne(int[] tab)
    {
        int moyenne=0;
        moyenne=somme(tab)/tab.length;
        return moyenne;
    }

    public static void afficheSupMoyenne(int[] tab)
    {
        for (int i=0;i<tab.length;i++)
        {
            if (tab[i]>moyenne(tab))
                System.out.println(tab[i]);
        }
    }

    public static int nbMaxi(int[] tab)
    {
        int nb=0;
        for (int i=0;i<tab.length;i++)
        {
            if (tab[i]==getMax(tab))
                nb++;
        }
        return nb;
    }

    public static int[] fusion(int[]tab1, int[] tab2)
    {
        int [] tab3;
        tab3=new int[tab1.length+tab2.length];
        for (int i=0;i<tab1.length;i++)
        {
            tab3[i]=tab1[i];
        }

        int j=0;
        for (int i=tab1.length;i<tab3.length;i++)
        {
            tab3[i]=tab2[j];
            j++;
        }
        return tab3;
    }

    public static int[] add(int[] pTab, int pValeurNouvelle)
    {
        pTab[0]=pValeurNouvelle;
        return pTab;
    }

    public static int[] remove(int[] pTab, int pIndiceASupprimer)
    {
        pTab[pIndiceASupprimer]=0;
        return pTab;
    }
}
