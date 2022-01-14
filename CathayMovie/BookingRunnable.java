import java.util.ArrayList;

public class BookingRunnable implements Runnable, IBookingRunnable {
    BookingTicket bookingSpiderMan, bookingTheMatrix;
    Tickets tickets;
    String name, session;
    ArrayList<Integer> seat;
    ArrayList<BookingTicket> bookingTicket;

    // public void getInfo(BookingTicket bookingSpiderMan, BookingTicket
    // bookingTheMatrix) {
    // this.bookingSpiderMan = bookingSpiderMan;
    // this.bookingTheMatrix = bookingTheMatrix;
    // }
    @Override
    public void setInfo(ArrayList<BookingTicket> bookingTicket) {
        this.bookingTicket = bookingTicket;
    }

    @Override
    public void run() {

        IBookingTicket iBookingTicket = new GeneralTicket();
        IRandomTickets iRandomTickets = new RandomTickets();

        for (int i = 0; i < 1000; i++) {
            Tickets tickets = new Tickets();
            iRandomTickets.randomTicket(tickets);
            if (iBookingTicket.checkTicket(bookingTicket, tickets.getName(), tickets.getSession())) {
                iBookingTicket.bookingGeneralTicket(bookingTicket, tickets.getName(), tickets.getSession(),
                        tickets.getTickets());
            } else
                return;
        }

       
    }

}
