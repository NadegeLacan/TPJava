public class Chat extends AnimalHeritage
{
    public Chat(String pNom)
    {
        super(pNom);
    }

    public void miauler()
    {
        System.out.println(this.nom+" dit Miaouuuuuu");
        super.courir();
    }
}
