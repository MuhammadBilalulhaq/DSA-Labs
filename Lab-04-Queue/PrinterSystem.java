class PrinterQueue {
    String[] jobs = new String[10];
    int front = 0;
    int rear = -1;

    void addJob(String job) {
        rear++;
        jobs[rear] = job;
    }

    void processJob() {
        if (front > rear) {
            System.out.println("No Jobs");
        } else {
            System.out.println(jobs[front] + " printed");
            front++;
        }
    }
}

public class PrinterSystem {
    public static void main(String[] args) {

        PrinterQueue p = new PrinterQueue();

        p.addJob("File1");
        p.addJob("File2");
        p.addJob("File3");

        p.processJob();
        p.processJob();
        p.processJob();
    }
}