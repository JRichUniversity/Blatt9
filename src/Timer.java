public class Timer implements Runnable{
    static int threadCounter = 0;
    int threadNumber;
    int seconds;
    public Timer(int seconds){
        this.seconds = seconds;
        this.threadNumber = ++threadCounter;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nTimer Nr." + threadNumber + " mit " + seconds + " abgelaufen!");
    }
}
