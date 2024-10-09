package org.develhope.java_advanced.coding_challenges;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

    Return an integer denoting the sum of all numbers in the given range satisfying the constraint.



    Example 1:

    Input: n = 7
    Output: 21
    Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
    Example 2:

    Input: n = 10
    Output: 40
    Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
    Example 3:

    Input: n = 9
    Output: 30
 */
public class SumOfMultiples {
    public static void main(String[] args) {
        System.out.println(sumOfMultiplesBeforeJava8(7));
        System.out.println(sumOfMultiples(7));
    }

    private static int sumOfMultiplesBeforeJava8(int number) {
        int sum = 0;
        for( int num = 1; num <= number; num++) {
            if( num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                sum += num;
            }

        }
        return sum;
    }

    private static int sumOfMultiples(int number) {
        List<Integer> numbers = IntStream.rangeClosed(1, number) // Creates a stream from 1 to n (inclusive)
                .boxed() // Converts the IntStream to a Stream<Integer>
                .collect(Collectors.toList()); // Collects the stream into a lis
        return numbers.stream().filter(num -> num % 3 == 0 || num % 5 == 0 || num % 7 == 0)
                .reduce(0, Integer::sum);
    }
}
