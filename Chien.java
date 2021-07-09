public class Chien extends AnimalHeritage
{
    public Chien(String pNom)
    {
        super(pNom);
    }

    public void aboyer()
    {
        System.out.println(this.nom+" dit Wouafffff");
    }

}
