package org.develhope.java_advanced.coding_challenges;

public class FinalValueAfterOperations {
    /*
            Example 1:

        Input: operations = ["--X","X++","X++"]
        Output: 1
        Explanation: The operations are performed as follows:
        Initially, X = 0.
        --X: X is decremented by 1, X =  0 - 1 = -1.
        X++: X is incremented by 1, X = -1 + 1 =  0.
        X++: X is incremented by 1, X =  0 + 1 =  1.
        Example 2:

        Input: operations = ["++X","++X","X++"]
        Output: 3
        Explanation: The operations are performed as follows:
        Initially, X = 0.
        ++X: X is incremented by 1, X = 0 + 1 = 1.
        ++X: X is incremented by 1, X = 1 + 1 = 2.
        X++: X is incremented by 1, X = 2 + 1 = 3.
        Example 3:

        Input: operations = ["X++","++X","--X","X--"]
        Output: 0
        Explanation: The operations are performed as follows:
        Initially, X = 0.
        X++: X is incremented by 1, X = 0 + 1 = 1.
        ++X: X is incremented by 1, X = 1 + 1 = 2.
        --X: X is decremented by 1, X = 2 - 1 = 1.
        X--: X is decremented by 1, X = 1 - 1 = 0.
     */
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));

        operations =  new String[]{"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));



    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            switch (operation) {
                case "X++":
                case "++X":
                    result += 1;
                    break;
                case "X--":
                case "--X":
                    result -= 1;
                    break;
            }
        }

        return result;

    }
}
