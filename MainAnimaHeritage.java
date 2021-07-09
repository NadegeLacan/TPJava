public class MainAnimaHeritage
{
    public static void main(String[] args)
    {
        AnimalHeritage unAnimal=new AnimalHeritage("toto");
        unAnimal.courir();

        Chat leChat=new Chat("Smelly cat");
        leChat.nom="Smelly cat";
        leChat.miauler();
        leChat.courir();

        Chien leChien=new Chien("Peabody");
        leChien.nom="Peabody";
        leChien.aboyer();
        leChien.courir();

        System.out.println(unAnimal instanceof AnimalHeritage);
        System.out.println(leChat instanceof AnimalHeritage);
        System.out.println(leChat instanceof Chat);
        System.out.println(unAnimal instanceof Chat);

    }
}
