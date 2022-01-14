import java.util.ArrayList;

/**
 * 模擬寫入資料庫
 */

public class GeneralTicket implements IBookingTicket {

    // 確認有沒有剩餘票

    // 單一訂票
    @Override
    public int bookingGeneralTicket(ArrayList<BookingTicket> bookingTicket, String name, String session,
            ArrayList<Integer> tickets) {
        int sum = 0;

        for (int i = 0; i < bookingTicket.size(); i++) {
            if (bookingTicket.get(i).getName().equals(name)) {
                for (int j = 0; j < tickets.size(); j++) {
                    sum += tickets.get(j);
                }
                System.out.println("電影：" + name + " 影廳：" + session + "票數：" + tickets);
                System.out.println("--------------------------------------------");

                bookingTicket.get(i).setTickies(session, bookingTicket.get(i).getQuantity(session) - sum);
            }
        }

        // for (int i = 0; bookingTicket.get(i).getName().equals(name); i++) {
        // for (int j = 0; j < tickets.size(); j++) {
        // sum += tickets.get(j);
        // }
        // System.out.println("電影：" + name + " 影廳：" + session + "票數：" + tickets);
        // System.out.println("--------------------------------------------");

        // bookingTicket.get(i).setTickies(session,
        // bookingTicket.get(i).getQuantity(session) - sum);
        // }

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
    public boolean checkTicket(ArrayList<BookingTicket> bookingTicket, String movieName, String session) {
        for (int i = 0; i < bookingTicket.size(); i++) {
            if (bookingTicket.get(i).getName().equals(movieName)) {
                if (bookingTicket.get(i).getQuantity(session) < 0) {
                    System.out.println("沒票了");
                    return false;
                } else {
                    System.out.println(
                            "電影名稱: " + movieName + " 電影影廳: " + session + " 剩餘票數: " +
                                    bookingTicket.get(i).getQuantity(session));
                }
            }
        }
        // for (int i =0; bookingTicket.get(i).getName().equals(movieName); i++) {
        // if (bookingTicket.get(i).getQuantity(session) < 0) {
        // System.out.println("沒票了");
        // return false;
        // } else {
        // System.out.println(
        // "電影名稱: " + movieName + " 電影影廳: " + session + " 剩餘票數: " +
        // bookingTicket.get(i).getQuantity(session));
        // }

        // }
        // if (bookingTicket.getQuantity(session) < 0) {
        // System.out.println("沒票了");
        // return false;
        // }
        // else {
        // System.out.println(
        // "電影名稱: " + movieName + " 電影影廳: " + session + " 剩餘票數: " +
        // bookingTicket.getQuantity(session));
        // }
        return true;
    }

}