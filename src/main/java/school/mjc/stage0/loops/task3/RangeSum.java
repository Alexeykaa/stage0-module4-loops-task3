package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        long sum = firstBoarder;
        for (int i = firstBoarder + 1; i <= secondBoarder ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
