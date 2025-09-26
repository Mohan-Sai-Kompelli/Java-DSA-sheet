
import java.util.Scanner;

public class FindingMissingElement {

    public static void miss(int[] a) {
        int n = a.length;
        int xor1 = 0;
        int xor2 = 0;

        // XOR of array elements and indices
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ a[i]; // XOR of given elements
            xor1 = xor1 ^ i;    // XOR of indices
        }

        int xor = xor1 ^ xor2;

        System.out.println("The missing element is : " + (xor ^ n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements into the array of size " +( n-1));

        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }

        miss(a);
    }
}

