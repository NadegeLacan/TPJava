package batailleGame;
import java.util.Scanner;

public class PlayerHuman extends Player
{
    public PlayerHuman()
    {
        super("",0);
        Scanner playerScan = new Scanner(System.in);

        System.out.println("Entrez votre nom :");
        String playerName=playerScan.nextLine();

        System.out.println("Entrez votre nombre de carte :");
        int playerSize=playerScan.nextInt();

        super.mName = playerName;
        super.mDeckPlayer.initDeck(playerSize);
    }
}
