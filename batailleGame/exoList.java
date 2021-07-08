package batailleGame;
import java.util.ArrayList;

public class exoList
{
    private ArrayList<Card> myCardList = new ArrayList<Card>();

    public void fill(int pSize)
    {
        Card.Color[] myColor=Card.Color.values();
        Card.CardName[] myCardName=Card.CardName.values();

        int rand1, rand2;

        for (int i=0;i<pSize;i++)
        {
            rand1=(int)(Math.random() * 4);
            rand2=(int)(Math.random() * 13);
            this.myCardList.add(new Card(myColor[rand1],myCardName[rand2]));
        }
    }

    public void print()
    {
        
    }
    //Public CardgetFirstElement()
    //Public CardgetElement(intpIndex)
}
