import java.util.*;

public class MovingAverage {

    Queue<Integer> queue;
    int size;
    double sum;

    public MovingAverage(int size) {
        this.size = size;
        queue = new LinkedList<>();
        sum = 0;
    }

    public double next(int val) {

        queue.add(val);
        sum = sum + val;

        // If queue has more elements than required size
        if (queue.size() > size) {
            sum = sum - queue.poll();
        }

        return sum / queue.size();
    }

    public static void main(String[] args) {

        MovingAverage obj = new MovingAverage(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}