package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int i = 0;
        System.out.println(i);
        if (lastFibonacci > 1) {
            int j = 1;
            System.out.println(j);
            for (int k = 2; k < lastFibonacci ; k++) {
                int next = i + j;
                i = j;
                j = next;
                System.out.println(next);
            }

        }

    }
}
