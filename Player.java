import java.util.ArrayList;

public class Player {
    private String name;
    private long cash;
    private long id;
    private long cashTable;

    public long getCashTable() {
        return cashTable;
    }
    public void initCashTable(){
        cash =+ cashTable;
        cashTable = 0;
    }
    public void setCashTable(long cashTable) {
        this.cashTable = cashTable;
        cash -= this.cashTable;
    }

    private Card [] biggerHand_5 ;
    private ArrayList<Card> hand;

    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    public Player(){
        biggerHand_5 = new Card[5];
        hand = new ArrayList<>();

    }

    public Card[] getBiggerHand_5() {
        return biggerHand_5;
    }

    public void setBiggerHand_5(Card[] biggerHand_5) {
        this.biggerHand_5 = biggerHand_5;
    }
}
