package back_gi_sun_al_lecture.queue;

public class Main {
    public static void main(String[] args) {
        Qprac<Integer> queue = new Qprac<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}
