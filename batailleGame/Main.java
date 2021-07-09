package batailleGame;

public class Main
{

    public static void main(String[] args) {
        // creation des joueurs
        Player P1 = new Player("Angleterre",10);
        Player P2 = new PlayerHuman();

        Card lCard1=new Card(Card.Color.COEUR,Card.CardName.AS);
        System.out.println(lCard1);

        while (P1.nbCard()>0 || P2.nbCard()>0)
        {
            // On tire une carte pour le joueur
            Card currentCardP1=P1.pullACard();
            Card currentCardP2=P2.pullACard();

            System.out.println(P1.getName()+" a tiré carte "+currentCardP1.getName()+" "+currentCardP1.getColor());
            System.out.println(P2.getName()+" a tiré carte "+currentCardP2.getName()+" "+currentCardP2.getColor());

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
        }
    }
}
