import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a == 1) first();
        if (a == 2) second();
        if (a == 3) three();
        if (a == 4) four();
    }

    public static void first() {
        Stack<Integer> S = new Stack<Integer>();
        Stack<Integer> R = new Stack<Integer>();
        Thread_A A =  new Thread_A(S);

        Thread_B B = new Thread_B(A,S,R);
        Thread_C C  =  new Thread_C(A,S,R);
        A.start();
        B.start();
        C.start();
        new Thread_D(B,C,R).start();
    }

    public static void second(){
        Stack<Integer> S = new Stack<Integer>();
        Stack<Integer> R = new Stack<Integer>();
        Thread_A_2 A =  new Thread_A_2(S);

        Thread_B_2 B = new Thread_B_2(A,S,R);
        Thread_C_2 C  =  new Thread_C_2(A,S,R);
        A.start();
        B.start();
        C.start();
        new Thread_D_2(B,C,R).start();
    }

    public static void three(){
        Stack<Integer> S = new Stack<Integer>();
        Stack<Integer> R = new Stack<Integer>();
        Thread_A_2 A =  new Thread_A_2(S);

        Thread_B_3 B = new Thread_B_3(A,S,R);
        Thread_C_3 C  =  new Thread_C_3(A,S,R);
        A.start();
        B.start();
        C.start();
        new Thread_D_3(B,C,R).start();
    }

    public static void four(){
        Stack<Integer> S = new Stack<Integer>();
        Stack<Integer> R = new Stack<Integer>();
        Thread_A_2 A =  new Thread_A_2(S);

        Thread_B_4 B = new Thread_B_4(A,S,R);
        Thread_C_3 C  =  new Thread_C_3(A,S,R);
        A.start();
        B.start();
        C.start();
        new Thread_D_4(B,C,R).start();
    }

}