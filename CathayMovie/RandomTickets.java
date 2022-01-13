import java.util.ArrayList;

public class RandomTickets implements IRandomTickets {

    ArrayList<Integer> ticketQuantityList = new ArrayList<>();
    int sessionNumber, movieNumber, remainTickets;
    String sessionName = "", movieName = "";

    @Override
    public void randomTicket(Tickets tickets) {
        ticketQuantityList.clear();
        for (int i = 0; i <= 3; i++) {
            ticketQuantityList.add((int) (Math.random() * 3));
            tickets.setTickets(ticketQuantityList);
        }
        sessionNumber = (int) (Math.random() * 3);
        movieNumber = (int) (Math.random() * 2);
        
        switch (sessionNumber) {
            case 0:
                tickets.setSession("影廳A");
                break;
            case 1:
                tickets.setSession("影廳B");
                break;
            case 2:
                tickets.setSession("影廳C");
                break;
        }

        switch (movieNumber) {
            case 0:
                tickets.setName("蜘蛛人");
                break;
            case 1:
                tickets.setName("駭客任務");
                break;
        }
    }

}
