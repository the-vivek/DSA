import java.util.*;

public class FindTheWinner {

    public static int findTheWinner(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();

        // Add players 1 to n
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {

            // Move k - 1 players to the back
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll());
            }

            // Remove the kth player
            queue.poll();
        }

        return queue.peek();
    }

    public static void main(String[] args) {

        int n = 5;
        int k = 2;

        int winner = findTheWinner(n, k);

        System.out.println("Winner = " + winner);
    }
}