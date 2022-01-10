import java.util.ArrayList;

public class BookingTicketPackage extends BookingTicket {

    private int packageTicket;

    public BookingTicketPackage(int date, String name, String session, ArrayList<Integer> quantity, int packageTicket) {
        super(date, name, session, quantity);
        this.packageTicket = packageTicket;
    }

    public int getPackageTicket() {
        return packageTicket;
    }
}
