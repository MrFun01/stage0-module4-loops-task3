package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int res=1;
        if (first != 0 && second != 0) {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first%i==0&&second%i==0){
                 res=i;
                }
            }
            System.out.println(res);
        }else {
            System.out.println(first>second?first:second);
        }
    }
}
