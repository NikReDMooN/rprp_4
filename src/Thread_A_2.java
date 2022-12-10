import java.util.Stack;
import java.util.concurrent.TimeUnit;

class Thread_A_2 extends Thread {

    Stack<Integer> S;
    Thread_A_2(Stack<Integer> S){
        this.S = S;
    }

    public void run(){
        for(int i =0; i < 4000; i++) {
            synchronized (S) {
                this.S.push(i);
                System.out.println(" A is push in S " + i);
            }
        }
    }



}
