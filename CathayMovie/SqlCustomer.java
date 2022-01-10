/**
 * 模擬寫入資料庫
 */

public class SqlCustomer implements IBookingTicket {

    @Override
    public int checkTicket(int date, String name) {
        int tiecketQuantity = 0;
        // System.out.println("SELECT ticketQuantity FROM CathayMovie WHERE date = " +
        // date + " name = "+ name);
        return tiecketQuantity;
    }

    @Override
    public int bookingGeneralTicket(BookingTicket bookingTicket) {
        System.out.println("訂票電影名稱：" + bookingTicket.getName() + bookingTicket.getSession() + bookingTicket.getDate()
                + bookingTicket.getQuantity());
        return bookingTicket.getQuantity().get(0) * 320 + bookingTicket.getQuantity().get(1) * 300
                + bookingTicket.getQuantity().get(2) * 300 + bookingTicket.getQuantity().get(3) * 160;
    }

    @Override
    public int bookingTicketPackage(BookingTicketPackage bookingTicketPackage) {

        int ticketPrice = 0;
        if (bookingTicketPackage.getPackageTicket() == 1){
            System.out.println("套票種類：套票類型1");
            ticketPrice = 299;
        }
        return ticketPrice;
    }

}