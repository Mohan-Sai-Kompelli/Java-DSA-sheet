
import java.util.Scanner;

public class ArraySorted_or_Not {
	
	public static boolean isSorted(int n) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[n];
		System.out.println("Enter the elements inside the array of size "+n);
		a[0] = sc.nextInt();
		for(int i=1;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]>=a[i-1]) {
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valus of n");
		int n = sc.nextInt();
		System.out.println(isSorted(n));
	}
	

}
