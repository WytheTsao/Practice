import java.util.ArrayList;
import java.util.HashMap;

/**
 * 電影種類
 */

public class BookingTicket {
    private String name;
    private ArrayList<String> session;
    private ArrayList<Integer> quantity;
    private HashMap<String, Integer> seat;

    public void setSeat(HashMap<String, Integer> seat) {
        this.seat = seat;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSession(ArrayList<String> session) {
        this.session = session;
    }

    public void setTickies(String session,int tickets){
        this.seat.put(session, tickets);
    }

    public ArrayList<String> getSession() {
        return session;
    }

    public int getQuantity(String session) {
        return this.seat.get(session);
    }

    public String getName() {
        return name;
    }
}