package SecondTurn;

import java.util.Scanner;

public class RunnableMulti {
    public RunnableMulti()
    {

    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        MultiThreads mt_one = new MultiThreads(1,x);
        MultiThreads mt_two = new MultiThreads(10,x);
        MultiThreads mt_three = new MultiThreads(100,x);
        MultiThreads mt_four = new MultiThreads(1000,x);
        MultiThreads mt_five = new MultiThreads(10000,x);
        MultiThreads mt_six = new MultiThreads(100000,x);
        MultiThreads mt_seven = new MultiThreads(1000000,x);
        MultiThreads mt_eight = new MultiThreads(10000000,x);
        MultiThreads mt_nine = new MultiThreads(100000000,x);
        MultiThreads mt_ten = new MultiThreads(1000000000,x);

        Thread t_one = new Thread(mt_one);
        Thread t_two = new Thread(mt_two);
        Thread t_three = new Thread(mt_three);
        Thread t_four = new Thread(mt_four);
        Thread t_five = new Thread(mt_five);
        Thread t_six = new Thread(mt_six);
        Thread t_seven = new Thread(mt_seven);
        Thread t_eight = new Thread(mt_eight);
        Thread t_nine = new Thread(mt_nine);
        Thread t_ten = new Thread(mt_ten);

        t_one.start();
        t_two.start();
        t_three.start();
        t_four.start();
        t_five.start();
        t_six.start();
        t_seven.start();
        t_eight.start();
        t_nine.start();
        t_ten.start();
        sc.close();
    }
}
