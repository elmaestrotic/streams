import java.util.Arrays;
import java.util.Scanner;

public class StreamScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int[] fuente = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] indices = Arrays.stream(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(fuente[indices[0]] + fuente[indices[1]]);
        }
    }
}
/*Sum of indexed values

Given an array of integers. Perform the sum of 2 values exist in the array, which will be indicated by 2 integers a and b.

The first line contains the number of cases
the next line contains the values of the first vector separated by spaces.
the next line contains 2 integers separated by a space and which will be the indices of the values to be added.

The next line will contain the values of the next vector separated by space and the next line to that will contain 2 integers separated by a space and which will be the indices of the values to be added and so on according to the number of case.

Example:

2
7 8 20 5 8 4 55
1 4
3 1 4 1 5 9
3 5


Output:
16
13


 */