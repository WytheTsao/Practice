import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 20220122新人訓
 */
public class Main {
    public static void main(String[] args) {
        IBookingTicket counterStaff = new GeneralTicket();

        HashMap<String, Integer> seat = new HashMap<>();
        seat.put("影廳A", 218);
        seat.put("影廳B", 220);
        seat.put("影廳C", 230);

        ArrayList<String> movieList = new ArrayList<>(List.of("蜘蛛人", "駭客任務"));
        ArrayList<BookingTicket> bArrayList = new ArrayList<>();
        BookingTicket spiderMan = new BookingTicket();
        BookingTicket theMatrix = new BookingTicket();
        bArrayList.add(spiderMan);
        bArrayList.add(theMatrix);

        theMatrix.setName(movieList.get(1));
        spiderMan.setName(movieList.get(0));

        spiderMan.setSeat(seat);
        theMatrix.setSeat(seat);

        // Tickets tickets = new Tickets();
        // IRandomTickets iRandomTickets = new RandomTickets();
        // iRandomTickets.randomTicket(tickets);
            BookingRunnable bookingRunnable = new BookingRunnable();
            // bookingRunnable.setInfo(bArrayList, tickets.getName(), tickets.getSession(),
            // tickets.getTickets());
            bookingRunnable.setInfo(bArrayList);
    
            Thread bookingTread = new Thread(bookingRunnable);
            bookingTread.start();
        


        // if(counterStaff.checkTicket(bArrayList, tickets.getName(),
        // tickets.getSession())){
        // IRandomTickets iRandomTickets = new RandomTickets();
        // iRandomTickets.randomTicket(tickets);
        // BookingRunnable bookingRunnable = new BookingRunnable();
        // bookingRunnable.setInfo(bArrayList, tickets.getName(), tickets.getSession(),
        // tickets.getTickets());
        // Thread bookingTread = new Thread(bookingRunnable);
        // bookingTread.start();
        // }
        // do {
        // } while (counterStaff.checkTicket(bArrayList, tickets.getName(),
        // tickets.getSession())
        // || counterStaff.checkTicket(bArrayList, tickets.getName(),
        // tickets.getSession()));

    }
}
