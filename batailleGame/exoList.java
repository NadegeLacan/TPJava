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
        for(int i=0;i<myCardList.size();i++)
        {
            System.out.println(myCardList.get(i));
        }
    }

    public Card getFirstElement()
    {
        return myCardList.get(0);
    }

    public Card getElement(int pIndex)
    {
        return myCardList.get(pIndex);
    }
}
