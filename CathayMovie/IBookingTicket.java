import java.util.ArrayList;

public interface IBookingTicket {
    boolean checkTicket(ArrayList<BookingTicket> bookingTicket, String movieName, String session);

    int bookingGeneralTicket(ArrayList<BookingTicket> bookingTicket, String name, String session,
            ArrayList<Integer> seat);

    int bookingTicketPackage(BookingTicket bookingTicket);

}
