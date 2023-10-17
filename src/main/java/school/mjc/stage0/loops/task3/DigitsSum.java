package school.mjc.stage0.loops.task3;

import static java.lang.Math.abs;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        t = abs(t);
        while(t > 0) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
