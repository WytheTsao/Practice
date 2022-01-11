public interface IBookingTicket {
    int checkTicket(int date, String movieName);

    int bookingGeneralTicket(BookingTicket bookingTicket);

    int bookingTicketPackage(BookingTicket bookingTicket);

}
