package batailleGame;
import java.util.ArrayList;

public class Deck {
    /**Attribut de la class Deck*/
    //Tableaux de Card correspondant au deck
    //private Card[] mCardsDeck;
    private ArrayList<Card> myCardList;

    /* CONSTRUCTEUR */
    public Deck()
    {
        this.myCardList = new ArrayList<Card>();
    }

    // Fonction nous permettant de consulter la 1ère carte de notre jeu
    public Card getFirstCardDeck()
    {
        return this.myCardList.get(0);
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
    public void initDeck(int size)
    {
        Card.Color[] myColor=Card.Color.values();
        Card.CardName[] myCardName=Card.CardName.values();

        int rand1, rand2;

        for (int i = 0; i<size; i++)
        {
            rand1=(int)(Math.random() * 4);
            rand2=(int)(Math.random() * 13);
            this.myCardList.add(new Card(myColor[rand1],myCardName[rand2]));
        }
    }

    public Card getCardDeck(int pIndex)
    {
        return myCardList.get(pIndex);
    }
}
