package batailleGame;

public class Player {
    /** Attribut de la class player*/
    private String mName; // nom
    private Deck mDeckPlayer; //deck de notre joueur

    /* CONSTRUCTEUR */
    public Player(String pName, int size)
    {
        this.mName=pName;
        this.mDeckPlayer = new Deck();
        this.mDeckPlayer.initDeck(size);
    }

    /**Méthodes de la class Player*/

    // Fonction nous permettant de consulter le nom de notre joueur
    public String getName()
    {
        return this.mName;
    }

    // Fonction qui tire la carte 0 du deck de notre joueur
    public Card pullACard()
    {
        return this.mDeckPlayer.getFirstCardDeck();
    }

    public int nbCard()
    {
        return this.mDeckPlayer.getSize();
    }

    // Fonction nous permettant de modifier le nom de notre joueur
    public void setName(String name)
    {
        this.mName = name;
    }


    // Fonction nous permettant de tirer une cartes
   /*public card drawCard()
    {
        //A compléter
        return card;
    }*/
}