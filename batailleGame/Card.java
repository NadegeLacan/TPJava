package batailleGame;

public class Card {
    enum CardName {
        DEUX,
        TROIS,
        QUATRE,
        CINQ,
        SIX,
        SEPT,
        HUIT,
        NEUF,
        DIX,
        VALET,
        DAME,
        ROI,
        AS
    };

    enum Color {
        COEUR,
        CARREAU,
        TREFLE,
        PIQUE
    }
    private final Color mColor;
    private final CardName mCardName;

    // CONSTRUCTEUR
    public Card(Color pColor, CardName pCardName)
    {
        // creation de nouvelle carte
        this.mCardName=pCardName;
        this.mColor=pColor;
    }

    // Fonction nous permettant de consulter le nom de la carte
    public CardName getName()
    {
        return this.mCardName;
    }

    // Fonction nous permettant de consulter la valeur de la carte
    public int getValue()
    {
        return this.mCardName.ordinal();
    }

    // Fonction nous permettant de consulter la couleur de la carte
    public Color getColor()
    {
        return this.mColor;
    }

    @Override
    public String toString()
    {
        return this.mCardName + " DE " + this.mColor;
    }
}
