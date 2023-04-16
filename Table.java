import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    Scanner scanner;
    private Player[] player;
    private int sizePlayerInTable;
    private int small,big;
    int countPlayer;
    long minBuyCash ,maxBuyCash;
    Deck deck ;
    private ArrayList<Card> cardTable;

    public Table(int sizePlayerInTable, int small, int big,long minBuyCash,long maxBuyCas){
        countPlayer = 0;
        this.sizePlayerInTable = sizePlayerInTable;
        player = new Player[this.sizePlayerInTable];
        this.small = small;
        this.big = big;
        this.minBuyCash = minBuyCash;
        this.maxBuyCash = maxBuyCas;
        scanner = new Scanner(System.in);


    }
    // reset table for start begin the game
    public void reset(){
        deck = new Deck();
        deck.makePack();
        deck.shuffleCards();
        cardTable = new ArrayList<>(5);
        flopTurnRiver();
    }

    public Player[] getPlayer() {
        return player;
    }

    public boolean setPlayer(Player player) {
        boolean b =true;
        long tempCash = 0;
        if(countPlayer < sizePlayerInTable && player.getCash() > this.minBuyCash){// check if there place in the table and if there enugh cash player
            System.out.println("Buy money between "+minBuyCash+"$" + "up to "+ maxBuyCash+"$");
            while(b){
                tempCash = scanner.nextLong();
                if(tempCash > 0 && tempCash <= player.getCash() && tempCash >= minBuyCash && tempCash <= maxBuyCash){
                    player.setCashTable(tempCash);
                    this.player[countPlayer++] = player;
                    b= false;
                }
            }


            return true;
        }else{
            return false;
        }

    }

    public int getSizePlayerInTable() {
        return sizePlayerInTable;
    }

    public void setSizePlayerInTable(int sizePlayerInTable) {
        this.sizePlayerInTable = sizePlayerInTable;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getBig() {
        return big;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public Deck getDeck() {
        return deck;
    }



    public ArrayList<Card> getCardTable() {
        return cardTable;
    }

    public void setCardTable(ArrayList<Card> cardTable) {
        this.cardTable = cardTable;
    }


    public void flopTurnRiver () {
        deck.getDeck().remove(0);
        cardTable.add(deck.getDeck().get(0));
        cardTable.add(deck.getDeck().get(0));
        cardTable.add(deck.getDeck().get(0));
        deck.getDeck().remove(0);
        cardTable.add(deck.getDeck().get(0));
        deck.getDeck().remove(0);
        cardTable.add(deck.getDeck().get(0));
    }

}
