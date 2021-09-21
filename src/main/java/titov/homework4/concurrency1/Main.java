package titov.homework4.concurrency1;

import java.util.function.IntConsumer;

public class Main {
    private final static Runnable printLand = () -> System.out.println("land");
    private final static Runnable printRover = () -> System.out.println("rover");
    private final static Runnable printLandRover = () -> System.out.println("landRover");
    private final static IntConsumer printNumber = System.out::println;

    public static void main(String[] args) {

        LandRover landRover = new LandRover(15);

        Thread a = new Thread(() -> {
            try {
                landRover.land(printLand);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread b = new Thread(() -> {
            try {
                landRover.rover(printRover);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread c = new Thread(() -> {
            try {
                landRover.landrover(printLandRover);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread d = new Thread(() -> {
            try {
                landRover.number(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        a.start();
        b.start();
        c.start();
        d.start();
    }
}
