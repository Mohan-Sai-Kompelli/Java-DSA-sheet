
import java.util.Scanner;

public class LeftRotateByD_place_Optimal {

	public static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = sc.nextInt();	
	int[] a = new int[n];
	System.out.println("Enter the value of  d");
	int d = sc.nextInt();
	d = d%n;
	System.out.println("Enter the value into tha array of size "+n);
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	reverse(a,0,d-1);
	reverse(a,d,n-1);
	reverse(a,0,n-1);
	
	for(int num : a)
	{
		System.out.print(num + " ");
	}
	
}
	
}
