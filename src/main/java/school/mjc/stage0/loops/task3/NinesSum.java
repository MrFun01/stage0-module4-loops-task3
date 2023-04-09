package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int digit=9,sum=0;
        for (int i = 0; i <lengthOfLastNumber; i++) {
            sum+=digit;
            digit=digit*10+9;
        }
        System.out.println(sum);
    }
}
