public class BookingRunnable implements Runnable {
    BookingTicket bookingSpiderMan, bookingTheMatrix;
    Tickets tickets;

    public void getInfo(BookingTicket bookingSpiderMan, BookingTicket bookingTheMatrix) {
        this.bookingSpiderMan = bookingSpiderMan;
        this.bookingTheMatrix = bookingTheMatrix;
    }

    @Override
    public void run() {

        IBookingTicket iBookingTicket = new GeneralTicket();
        IRandomTickets iRandomTickets = new RandomTickets();

        for (int i = 0; i < 1000; i++) {
            Tickets tickets = new Tickets();

            iRandomTickets.randomTicket(tickets);

            if (tickets.getName().equals(bookingSpiderMan.getName())) {
                if (iBookingTicket.checkTicket(bookingSpiderMan, tickets.getName(), tickets.getSession())) {
                    iBookingTicket.bookingGeneralTicket(bookingSpiderMan, tickets.getSession(), tickets.getTickets());
                } else {
                    break;
                }
            } else {
                if (iBookingTicket.checkTicket(bookingTheMatrix, tickets.getName(), tickets.getSession())) {
                    iBookingTicket.bookingGeneralTicket(bookingTheMatrix, tickets.getSession(), tickets.getTickets());

                } else {
                    break;
                }

            }

        }

    }

}
