package batailleGame;

public class Main {

    public static void main(String[] args) {
        // creation des joueurs
        Player P1 = new Player("Le bon",13);
        Player P2 = new Player("La brute",13);

        // On tire une carte pour le joueur
        Card currentCardP1=P1.pullACard();
        Card currentCardP2=P2.pullACard();

        Card ICard1=new Card(Card.Color.CARREAU,Card.CardName.AS);
        System.out.println(ICard1);

        // on compare les cartes tirées pour savoir qui gagne
        if (currentCardP1.getValue()> currentCardP2.getValue())
        {
            System.out.println(P1.getName()+" a gagné avec la carte "+currentCardP1.getName()+" "+currentCardP1.getColor());
        }
        else if (currentCardP1.getValue()< currentCardP2.getValue())
        {
            System.out.println(P2.getName()+" a gagné avec la carte "+currentCardP2.getName()+" "+currentCardP2.getColor());
        }
        else
        {
            System.out.println("BATAILLE");
        }

        exoList test = new exoList();
        test.fill(13);
    }
}
