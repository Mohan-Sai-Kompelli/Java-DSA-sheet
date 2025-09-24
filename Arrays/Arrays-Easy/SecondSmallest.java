
import java.util.Scanner;

public class SecondSmallest {

	public static void sSmall(int n) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[n];
		int s = Integer.MAX_VALUE;
		int ss = Integer.MAX_VALUE;
		System.out.println("Enter the values for array of size "+n);
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]<s) {
				ss = s;
				s = a[i];
			}
			else if(a[i]>s && a[i]<ss) {
				ss = a[i];
			}
		}
		System.out.println(ss);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		sSmall(n);
	}
}
