
import java.util.Scanner;

public class DuplicateInplaceRemoval {
	
	public static void remove_dup(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values inside the array of size "+n);
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int i=0;
		for(int j=0;j<n;j++) {
			if(a[i]!=a[j]) {
				i++;
				a[i] = a[j];
			}
		}
		for(int k=0;k<=i;k++) {
			System.out.print(a[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the n");
		int n = sc.nextInt();
		remove_dup(n);
	}
}
