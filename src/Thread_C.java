import java.util.Stack;
import java.util.concurrent.TimeUnit;

class Thread_C extends Thread {

    Stack<Integer> S;
    Stack<Integer> R;
    Thread_A A;
    Thread_C(Thread_A A,Stack<Integer> S, Stack<Integer> R){
        this.S = S;
        this.R = R;
        this.A = A;
    }

    public void run() {
        while(A.isAlive() || !S.isEmpty() ){


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
            System.out.println("Thread C push in R " + f/3);
        }
    }
    }



}
