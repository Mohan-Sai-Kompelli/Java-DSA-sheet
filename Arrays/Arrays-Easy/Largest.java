
import java.util.Scanner;

public class Largest {

	public int Large(int n) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[n];
		int l = Integer.MIN_VALUE;
		System.out.println("Enter the values for the array ");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]>l) {
				l = a[i];
			}
		}
		return l;
		
	}
	public static void main(String[] args) {
		Largest lr = new Largest();
		System.out.println(lr.Large(5));
	}
	
}
