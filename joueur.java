public class joueur
{
        private String mName;
        private int[] mCardsDeck=new int [13];

        public void play()
        {
            System.out.println(mName+" dit : c'est à mon tour de jouer");
        }

        public int drawCard()
        {
            //System.out.println(nom+" dit : c'est à mon tour de tirer une carte !");
            int rand = (int) Math.floor(0 + (Math.random() * 13));
            return mCardsDeck[rand];
        }

        public void initCards()
        {
            for (int i=0;i<13;i++)
            {
                mCardsDeck[i]=i+1;
            }
        }

        public String getName()
        {
            return mName;
        }

        public void setName(String pName)
        {
            mName=pName;
        }

        public int[] getCardDeck()
        {
            return mCardsDeck;
        }
}
