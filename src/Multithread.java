public class Multithread extends Thread{

    private int threadNumber;
    public Multithread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 1 ; i <= 5; i++){
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
