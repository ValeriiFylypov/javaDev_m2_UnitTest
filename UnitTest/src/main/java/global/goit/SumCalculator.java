package global.goit;

import java.util.stream.IntStream;

public class SumCalculator {

    public int sum(int n) {
        return IntStream.iterate(0, i -> i <= n, i -> i + 1)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("SumCalculator.sum(0) = " + new SumCalculator().sum(5));
    }
}