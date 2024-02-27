import java.util.LinkedList;
import java.util.Queue;

public class Manage{
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();

        // Enqueue print jobs
        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

        // Dequeue a print job
        String dequeuedJob = printQueue.poll();
        System.out.println("Dequeued Job: " + dequeuedJob);

        // Enqueue more print jobs
        printQueue.add("Document4");
        printQueue.add("Document5");

        // Peek at the next print job without removing it
        String peekedJob = printQueue.peek();
        System.out.println("Next Job to Print (Peek): " + peekedJob);

        // Print the list of print jobs in the queue
        System.out.println("Print Jobs in the Queue: " + printQueue);
    }
}





    