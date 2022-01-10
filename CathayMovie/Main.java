public class Main {
    public static void main(String[] args) {
        ICounterStaff counterStaff = new SqlCustomer();
        
        System.out.println("剩餘票數: " + counterStaff.checkTicket(20220110, "name"));
        counterStaff.booking(new CounterStaff(20220110, "蜘蛛人", "影廳A", 2));
        
    }
}
