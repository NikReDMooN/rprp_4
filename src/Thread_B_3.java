import java.util.Stack;
import java.util.concurrent.TimeUnit;

class Thread_B_3 extends Thread {

    Stack<Integer> S;
    Stack<Integer> R;
    Thread_A_2 A;
    Thread_B_3(Thread_A_2 A, Stack<Integer> S, Stack<Integer> R){
        this.S = S;
        this.R = R;
        this.A = A;
    }

    public void run() {
        while (A.isAlive() || !S.isEmpty()) {
            synchronized (S) {
                synchronized (R) {
                    if (S.isEmpty()) {
                        System.out.println("B is goint to sleep");
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    } else {
                        Integer f = S.pop();
                        R.push(f * f);
                        System.out.println("Thread B push in R " + f * f);
                    }
                }
            }
        }
    }




}
