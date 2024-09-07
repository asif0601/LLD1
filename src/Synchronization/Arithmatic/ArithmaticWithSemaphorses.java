package Synchronization.Arithmatic;

import java.util.concurrent.Semaphore;

public class ArithmaticWithSemaphorses {
    int count;
    private final Semaphore semaphore;

    public ArithmaticWithSemaphorses(int semaphore) {
        this.semaphore = new Semaphore(semaphore);
    }

    public void increament(){
        try {
            semaphore.acquire(); // Acquire a permit before incrementing
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit after incrementing
        }
    }
    public void decreament(){
        try {
            semaphore.acquire(); // Acquire a permit before incrementing
            count--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit after incrementing
        }
    }

    public String toString(){
        return "Count "+count;
    }

}
