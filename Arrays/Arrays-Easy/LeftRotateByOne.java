
import java.util.Scanner;

public class LeftRotateByOne {
	
	public static void leftRotate(int n) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[n];
		System.out.println("Enter the elements into the array of the size  "+n);
		int temp = sc.nextInt();
		for(int i=1;i<n;i++) {
			a[i-1] = sc.nextInt();
			
		}
		a[n-1] = temp;
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valus of n");
		int n = sc.nextInt();
		leftRotate(n);
	}

}
