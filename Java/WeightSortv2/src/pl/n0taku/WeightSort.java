package pl.n0taku;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeight(String strng) {
        return Arrays.stream(strng.split(" "))
                .sorted(Comparator
                        .comparing(WeightSort::sumDigit)
                        .thenComparing(String::compareTo))
                .collect(Collectors.joining(" "));
    }
    private static int sumDigit(String s){
        return s.chars().map(c->c-48).sum();
    }
}

