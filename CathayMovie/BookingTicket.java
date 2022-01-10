import java.util.ArrayList;

/**
 * 定義Counter Staff類別
 */

public class BookingTicket {
    private int date;
    private String name;
    private String session;
    private ArrayList<Integer> quantity;

    public BookingTicket(int date, String name, String session, ArrayList<Integer> quantity) {
        this.date = date;
        this.name = name;
        this.session = session;
        this.quantity = quantity;
    }

    public String getSession() {
        return session;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public int getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}