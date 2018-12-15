import java.util.Scanner;
import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        // Common Variables
        Scanner sc = new Scanner(System.in);
        int n;
        String str;
        int[] arr;


        // Factorial
        // Factorial f = new Factorial();
        // System.out.print("Enter a number whose factorial needs to be calculated : ");
        // n = sc.nextInt();
        // System.out.println("Factorial of " + n + " :: " + f.factorial(n));
        // System.out.println("\n");


        // Fibonacci Series
        // FibonacciSeries fs = new FibonacciSeries();
        // System.out.print("Enter how many Fibonacci numbers needs to be printed : ");
        // n = sc.nextInt();
        // arr = new int[n];
        // arr[0] = 0;
        // arr[1] = 1;
        // System.out.println("Fibonacci Series ::  "
        //     + Arrays.toString(fs.fibonacci(n, 2, 0, 1, arr)));
        // System.out.println("\n");


        // Binary Search
        BinarySearch bs = new BinarySearch();
        System.out.print("Enter the array size :: ");
        n = sc.nextInt();
        System.out.print("Enter the array elements :: ");
        int sortedArr[] = new int[n];
        for(int i = 0; i < n; i++) {
            sortedArr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search :: ");
        int ele = sc.nextInt();

        int pos = bs.binarySearch(sortedArr, 0, n - 1, ele);
        str = pos == -1
            ? "Sorry element " + ele + " not found."
            : "Element found at position :: " + (pos + 1);
        System.out.println(str);
        System.out.println("\n");


        // Towers Of Hanoi
        // TowersOfHanoi tof = new TowersOfHanoi();
        // System.out.print("Enter the number of discs :: ");
        // n = sc.nextInt();
        // System.out.print("Enter the source, destination and temporary tower names :: ");
        // String from = sc.next();
        // String to = sc.next();
        // String temp = sc.next();
        // System.out.println("Total moves :: " + tof.towerOfHanoi(n, from, to, temp, 0));
    }
}
