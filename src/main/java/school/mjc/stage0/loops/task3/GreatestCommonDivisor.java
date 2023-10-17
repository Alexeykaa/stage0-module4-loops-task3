package school.mjc.stage0.loops.task3;

import java.math.BigInteger;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = BigInteger.valueOf(first).gcd(BigInteger.valueOf(second)).intValue();
        System.out.println(gcd);
    }
}
