
import java.util.Scanner;

public class IntersectionArray_Optimal {
	
	public static void intersection(int[] a,int[] b,int n,int m) {
		int i=0,j=0;
		int x = 0;
		int[] in = new int[m];
		while(i<n && j<m) {
			if(a[i]<b[j]) {
				i++;
			}
			else if(b[j]<a[i]) {
				j++;
			}
			else {
				in[x++] = a[i];
				i++;
				j++;
			}
		}
		for(int num : in) {
			System.out.print(num+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("Enter the value of m");
		int m = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the values into the array a of size "+n);
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		System.out.println("Enter the values into the array a of size "+m);
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		intersection(a,b,n,m);
	}

}
