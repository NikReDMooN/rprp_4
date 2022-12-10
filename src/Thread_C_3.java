import java.util.Stack;
import java.util.concurrent.TimeUnit;

class Thread_C_3 extends Thread {

    Stack<Integer> S;
    Stack<Integer> R;
    Thread_A_2 A;
    Thread_C_3(Thread_A_2 A,Stack<Integer> S, Stack<Integer> R){
        this.S = S;
        this.R = R;
        this.A = A;
    }

    public void run() {
        while(A.isAlive() || !S.isEmpty() ) {

            synchronized (R) {
                synchronized (S) {
                    if (S.isEmpty()) {
                        try {
                            System.out.println("C is goint to sleep");
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    } else {
                        Integer f = S.pop();
                        R.push(f / 3);
                        System.out.println("Thread C push in R " + f / 3);
                    }
                }
            }
        }
    }



}
