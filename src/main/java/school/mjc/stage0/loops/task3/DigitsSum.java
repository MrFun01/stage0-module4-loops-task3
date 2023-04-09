package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int digit,sum=0;
        String s=String.valueOf(t);
        if (t<0){
            t=Math.abs(t);
        }
        for (int i=0;i<=s.length();i++){
            digit=t%10;
            sum+=digit;
            t=t/10;
        }
        System.out.println(sum);
    }
}
