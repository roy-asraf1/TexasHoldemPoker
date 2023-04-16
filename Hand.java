public class Hand {
    private Card[] cards;
    private int[] value;

    Hand(Deck d)
    {
        value = new int[6];
        cards = new Card[2];
        for (int x=0; x<2; x++)
        {
            cards[x] = d.drawFromDeck(); //fill up cards[] array.
        }

        //rest of our code to assign values to the value array goes here
    }


    void displayAll()
    {
        for (int x=0; x<5; x++)
            System.out.println(cards[x]); //calls cards[x].toString()
    }

    int compareTo(Hand that)
    {
        for (int x=0; x<6; x++) //cycle through values
        {
            if (this.value[x]>that.value[x])
                return 1;
            else if (this.value[x]<that.value[x])
                return -1;
        }
        return 0; //if hands are equal
    }
}
