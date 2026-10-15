import java.util.*;

public class TimeNeededToBuyTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> queue = new LinkedList<>();

        // Store the index of every person
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }

        int time = 0;

        while (!queue.isEmpty()) {

            int person = queue.poll();

            // Person buys one ticket
            tickets[person]--;
            time++;

            // If this person still needs tickets,
            // put them at the back of the queue
            if (tickets[person] > 0) {
                queue.add(person);
            }

            // Person k has bought all tickets
            if (tickets[k] == 0) {
                break;
            }
        }

        return time;
    }

    public static void main(String[] args) {

        int[] tickets = {2, 3, 2};
        int k = 2;

        int answer = timeRequiredToBuy(tickets, k);

        System.out.println("Time = " + answer);
    }
}