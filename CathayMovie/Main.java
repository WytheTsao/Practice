import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 20220122新人訓
 */
public class Main {
    public static void main(String[] args) {
        IBookingTicket counterStaff = new GeneralTicket();
    
        HashMap<String,Integer> seat = new HashMap<>();
        seat.put("影廳A", 218);
        seat.put("影廳B", 220);
        seat.put("影廳C", 230);

        ArrayList<String> movieList = new ArrayList<>(List.of("蜘蛛人","駭客任務"));
        
        BookingTicket spiderMan = new BookingTicket();
        BookingTicket theMatrix = new BookingTicket();
        theMatrix.setName(movieList.get(1));
        spiderMan.setName(movieList.get(0));

        spiderMan.setSeat(seat);
        theMatrix.setSeat(seat);
        BookingRunnable bookingRunnable = new BookingRunnable();
        bookingRunnable.getInfo(spiderMan,theMatrix);
        Thread bookingTread = new Thread(bookingRunnable);

        bookingTread.start();

    }
}
