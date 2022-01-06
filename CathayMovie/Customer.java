class Customer {
    public String customerName;
    public String movieName;
    public int date;
    public String movieSession;
    public int ticketQuantitiy;

    public Customer(String customerName,String movieName,int date,String movieSession,String ticketType,int ticketQuantitiyi){
        this.customerName = customerName;
        this.movieName = movieName;
        this.date = date;
        this.movieSession = movieSession;
        this.ticketQuantitiy = ticketQuantitiyi;
    }
    public String getTicketInfo(){
        return customerName;
    }
    public int getTicketQuantity(){
        return ticketQuantitiy;
    }

    public static void main(String[] args) {
        Customer c = new Customer("customerName", "movieName", 20220106, "movieSession", "ticketType",1);
        c.getTicketQuantity();
        System.out.println(c.getTicketQuantity());
    }
}