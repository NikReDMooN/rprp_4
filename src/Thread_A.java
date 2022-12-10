import java.util.Stack;
import java.util.concurrent.TimeUnit;

class Thread_A extends Thread {

     Stack<Integer> S;
     Thread_A(Stack<Integer> S){
         this.S = S;
     }

     public void run(){
         for(int i =0; i < 400; i++){
             this.S.push(i);
            System.out.println(" A is push in S " + i);
         }
     }



}
