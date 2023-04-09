package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f=1,t=0,s=0;
        System.out.println(t);
        System.out.println(f);
        for (int i = 2; i < lastFibonacci; ++i) {
            s=f+t;
            System.out.println(s);
            t=f;
            f=s;
        }
    }
}
