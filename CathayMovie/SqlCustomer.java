public class SqlCustomer implements ICounterStaff{

    @Override
    public int checkTicket(int date,String name) {
        int tiecketQuantity = 0;
        //System.out.println("SELECT ticketQuantity FROM CathayMovie WHERE date = " + date + " name = "+ name);
        return tiecketQuantity;
    }

    @Override
    public void booking(CounterStaff counterStaff) {
        System.out.println("訂票電影名稱：" + counterStaff.getName() + counterStaff.getSession() + counterStaff.getDate() + counterStaff.getQuantity());
    }
}