/**
 * 定義Counter Staff類別
 */

public class CounterStaff{
    private int date;
    private String name;
    private String session;
    private int quantity;

    public CounterStaff(int date,String name,String session,int quantity){
        this.date = date;
        this.name = name;
        this.session = session;
        this.quantity = quantity;
    }
    public String getSession(){
        return session;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getDate() {
        return date;
    }
    public String getName(){
        return name;
    }
}