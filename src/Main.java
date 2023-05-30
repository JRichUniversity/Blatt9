import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumberPrinter np = new NumberPrinter();
        NumberPrinter.OddPrinter op = np.new OddPrinter(0);
        NumberPrinter.EvenPrinter ep = np.new EvenPrinter(1);
        Thread t1 = new Thread(op);
        Thread t2 = new Thread(ep);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
        }

        System.out.println("\n\n\n");

        startTimerThread();
    }

    public static void startTimerThread() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Geben Sie die Dauer des Timers in Sekunden ein (0 zum Beenden): ");
            int duration = scanner.nextInt();

            if(duration == 0){
                System.out.println("\nEnding process. Waiting for timers to finish...");
                break;
            }

            Timer timerThread = new Timer(duration);
            Thread timer = new Thread(timerThread);
            timer.start();
        }
        scanner.close();
    }
}
