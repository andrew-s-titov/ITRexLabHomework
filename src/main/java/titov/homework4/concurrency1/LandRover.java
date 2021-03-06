package titov.homework4.concurrency1;

import java.util.function.IntConsumer;

public class LandRover {
    private final int n;
    private volatile int count = 1;

    public LandRover(int n) {
        if (n < 1 || n > 50) {
            throw new IllegalArgumentException(
                    "constructor parameter of a LandRover instance (number) can't be less than 1 and more than 50");
        }
        this.n = n;
    }

    private synchronized void doOrWait(boolean condition, Runnable task) throws InterruptedException{
        if (condition) {
            task.run();
            count++;
            notifyAll();
        } else {
            wait();
        }
    }

    private boolean divisibleBy5() {
        return count % 5 == 0;
    }
    private boolean divisibleBy3() {
        return count % 3 == 0;
    }

    // printLand.run() outputs "land".
    public synchronized void land(Runnable printLand) throws InterruptedException{
        while (count <= n) {
            doOrWait(divisibleBy3() && !divisibleBy5(), printLand);
        }
    }

    // printRover.run() outputs "rover".
    public synchronized void rover(Runnable printRover) throws InterruptedException{
        while (count <= n) {
            doOrWait(divisibleBy5() && !divisibleBy3(), printRover);
        }
    }

    // printLandRover.run() outputs "landrover".
    public synchronized void landrover(Runnable printLandRover) throws InterruptedException{
        while (count <= n) {
            doOrWait(divisibleBy3() && divisibleBy5(), printLandRover);
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException{
        while (count <= n) {
            doOrWait(!divisibleBy3() && !divisibleBy5(), () -> printNumber.accept(count));
        }
    }
}