import java.util.ArrayList;

/**
 * 模擬寫入資料庫
 */

public class GeneralTicket implements IBookingTicket {

    // 確認有沒有剩餘票

    // 單一訂票
    @Override
    public int bookingGeneralTicket(BookingTicket bookingTicket, String session, ArrayList<Integer> tickets) {
        int sum = 0;
        for (int i = 0; i < tickets.size(); i++) {
            sum += tickets.get(i);
        }
        System.out.println("電影：" + bookingTicket.getName() + " 影廳：" + session + " 票數：" + tickets);
        System.out.println("--------------------------------------------");

        bookingTicket.setTickies(session, bookingTicket.getQuantity(session) - sum);
        return sum;
    }

    // 訂套票
    @Override
    public int bookingTicketPackage(BookingTicket bookingTicket) {

        int ticketPrice = 0;
        if (((BookingTicketPackage) bookingTicket).getPackageTicket() == 1) {
            System.out.println("套票種類：套票類型1");
            ticketPrice = 299;
        }
        return ticketPrice;
    }

    @Override
    public boolean checkTicket(BookingTicket bookingTicket, String movieName, String session) {

        if (bookingTicket.getQuantity(session) < 0) {
            System.out.println("沒票了");
            return false;
        } else {
            System.out.println(
                    "電影名稱: " + movieName + " 電影影廳: " + session + " 剩餘票數: " + bookingTicket.getQuantity(session));
        }
        return true;
    }

}