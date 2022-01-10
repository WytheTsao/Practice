import java.util.ArrayList;
/**
 * 20220122新人訓
 */
public class Main {
    public static void main(String[] args) {
        IBookingTicket counterStaff = new SqlCustomer();
        // 查詢剩餘票數
        System.out.println("剩餘票數: " + counterStaff.checkTicket(20220110, "name"));
        // 訂票
        ArrayList<Integer> ticketList = new ArrayList<>();
        ticketList.add(1);
        ticketList.add(1);
        ticketList.add(1);
        ticketList.add(1);

        // 單一訂票
        System.out.println(
                "總價格: " + counterStaff.bookingGeneralTicket(new BookingTicket(20220110, "蜘蛛人", "影廳A", ticketList)));

        // 套票
        System.out.println("總價格: "
                + counterStaff.bookingTicketPackage(new BookingTicketPackage(20220110, "蜘蛛人", "影廳A", ticketList, 1)));

    }
}
