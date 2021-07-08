public class animal {

    private String mNom;

    //constructeur sans paramètre
    public animal()
    {
        //this.mNom="mon nom est personne";
        //appelle constructeur surchargé
        this("mon nom est personne");
    }

    //constructeur surchargé
    public animal(String pNom)
    {
        this.mNom=pNom;
    }

    // constructeur par recopie appelle constructeur surchargé
    public animal(animal pAnimalCopie)
    {
        //this.mNom=pAnimalCopie.mNom;
        //passage par le constructeur surchargé
        this(pAnimalCopie.mNom);
    }

    public void display()
    {
        System.out.println(this.mNom);
    }
/*******************************************************
*GETTERS AND SETTERS
 *************************/
    public void setmNom(String mNom)
    {
        this.mNom = mNom;
    }
    public static void main (String[] pArgs)
    {
        animal a=new animal();
        animal b=new animal("Medor");
        animal c=new animal(b);

        a.display();
        b.display();
        c.display();

        c.setmNom("toto");
        b.display();
        c.display();
    }
}
