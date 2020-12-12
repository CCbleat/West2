package SecondTurn;

public class MultiThreads implements Runnable {
    long start;
    long ans = 0;
    int x;
    public MultiThreads(int start, int x)
    {
        this.start = start;
        this.x = x;
    }
    public void run() {
        for(long i = this.start; i < this.start * 10; ++i) {
            if (contain(i, this.x)) {
                this.ans += i;
            }
        }

        System.out.println(this.ans);
    }
    private static boolean contain(long num, int x) {
        return String.valueOf(num).contains(String.valueOf(x));
    }
}
