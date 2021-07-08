public class mainObjets {
    public static void main (String[] args)
    {
        joueur leJoueur1=new joueur();
        joueur leJoueur2=new joueur();

        leJoueur1.setName("Jean");
        leJoueur2.setName("Nadege");

        leJoueur1.initCards();
        leJoueur2.initCards();

        leJoueur1.play();
        leJoueur2.play();

        System.out.println(leJoueur1.drawCard());
        System.out.println(leJoueur2.drawCard());

        System.out.println(leJoueur1.getName());
        System.out.println(leJoueur2.getName());

        System.out.println(leJoueur1.getCardDeck());
        System.out.println(leJoueur2.getCardDeck());
    }
}
