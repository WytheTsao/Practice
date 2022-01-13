import java.util.ArrayList;

public interface IBookingTicket {
    boolean checkTicket(BookingTicket bookingTicket, String movieName, String session);

    int bookingGeneralTicket(BookingTicket bookingTicket, String session, ArrayList<Integer> tickets);

    int bookingTicketPackage(BookingTicket bookingTicket);

}
