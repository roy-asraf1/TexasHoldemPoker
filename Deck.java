import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//We put the cards in the ArrayList of Cards, then randomly take 100 pairs of cards and switch them,
// shuffling our deck. To draw from the deck, we just return the first element/card, and then remove
// that card from the deck. All the randomization is done beforehand in the constructor
// (prior to any actual dealing of the cards),
// making our drawFromDeck method much simpler and less processor intensive.

public class Deck {
    private ArrayList<Card> deck;
    int index_1, index_2;

    Deck()
    {
        deck = new ArrayList<>();

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void  makePack() {
        short count = 0;
        String [] shape = {"c", "d", "h", "s"};


        // i= 11 -> jeck ,   i = 12 -> quin ,   i = 13 -> king ,   i = 14 -> ace
        for (short i = 1; i < 15; i++) {
            for (short j = 0; j < 4; j++) {
                Card a = new Card(i, shape[j]);
                deck.add(a);
            }
        }

    }
    public void shuffleCards(){
        Collections.shuffle(deck);

    }
    public Card drawFromDeck()
    {
        return deck.remove( 0 );
    }

    public int getTotalDeck()
    {
        return deck.size();
    }
}
