
import java.util.Scanner;

public class SecondLargest {

	public static void sLarge(int n) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[n];
		int l = Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE;
		System.out.println("Enter the values into the array");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]>l) {
				sl = l;
				l = a[i];
			}
			else if(a[i]<l && a[i]>sl) {
				sl = a[i];
			}
			
		}
		System.out.println(sl);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sLarge(n);
	}
}
