
import java.util.ArrayList;

public class Card {
    private short rank;
    private String shape;

    public Card(short rank, String shape) {
        this.rank = rank;
        this.shape = shape;
    }

    public short getRank() {
        return rank;
    }

    public String getShape() {
        return shape;
    }

    public void setRank(short rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "card{" +
                "rank=" + rank +
                ", shape=" + shape +
                '}';
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


}