public class NumberPrinter implements Runnable{

    @Override
    public void run() {}

    public class OddPrinter extends NumberPrinter{
        private int threadNumber;
        public OddPrinter(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run(){
            for(int i = 0; i <= 99; i++){
                if(i % 2 == 1){
                    System.out.println(i + " from thread " + threadNumber);
                }
            }
        }
    }

    public class EvenPrinter extends NumberPrinter{
        private int threadNumber;
        public EvenPrinter(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run(){
            for(int i = 0; i <= 99; i++){
                if(i % 2 == 0){
                    System.out.println(i + " from thread " + threadNumber);
                }
            }
        }
    }
}
