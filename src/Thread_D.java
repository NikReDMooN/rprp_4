import java.util.Stack;
import java.util.concurrent.TimeUnit;

class Thread_D extends Thread {

    Stack<Integer> R;
    Thread_B B;
    Thread_C C;
    Thread_D(Thread_B B, Thread_C C, Stack<Integer> R){
        this.R = R;
        this.B = B;
        this.C = C;
    }

    public void run() {
        while(B.isAlive() || C.isAlive() || !R.isEmpty())
        if (R.isEmpty()) {
            System.out.println("D is going to sleep");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            Integer f = R.pop();
            System.out.println(f);
        }
    }



}
