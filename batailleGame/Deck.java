package batailleGame;

public class Deck {
    /**Attribut de la class Deck*/
    //Tableaux de Card correspondant au deck
    private Card[] mCardsDeck;

    /* CONSTRUCTEUR */
    public Deck(int nbCard)
    {
        this.mCardsDeck= new Card[nbCard];
    }

    // Fonction nous permettant de consulter la 1ère carte de notre jeu
    public Card getFirstCardDeck()
    {
        return this.mCardsDeck[0];
    }

    //Fonction nous permettant d'ajouter une carte à notre jeu
    public void addCard(Card loosingCard)
    {

    }

    //Fonction nous permettant d'enlever une carte à notre jeu
    public void removeCard(Card loosingCard)
    {

    }

    // Fonction nous permettant d'initialiser un jeu de cartes aléatoires
    public void initDeck()
    {
        Card.Color[] myColor=Card.Color.values();
        Card.CardName[] myCardName=Card.CardName.values();

        int rand1, rand2;

        for (int i=0;i<this.mCardsDeck.length;i++)
        {
            rand1=(int)(Math.random() * 4);
            rand2=(int)(Math.random() * 13);
            this.mCardsDeck[i] = new Card(myColor[rand1],myCardName[rand2]);
        }
    }
}
