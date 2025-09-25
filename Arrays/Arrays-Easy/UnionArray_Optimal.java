
import java.util.Scanner;

public class UnionArray_Optimal {

	public static void union(int[] a,int[] b,int n,int m) {
		int i=0,j=0;
		int x=0;
		int[] u = new int[n+m];
		while(i<n && j<m) {
			if(a[i]<=b[j]) {
				if(x==0 || u[x-1]!=a[i]) {
					u[x++] = a[i];
				}
				i++;
			}
			else {
				if(x==0 || u[x-1]!=b[j]) {
					u[x++] = b[j];
				}
				j++;
			}
		}
		while(i<n) {
				if(x==0 || u[x-1]!=a[i]) {
					u[x++] = a[i];
				}
				i++;
		}
		while(j<m) {
			if(x==0 || u[x-1]!=b[j]) {
				u[x++] = b[j];
			}
			j++;
		}
		for(int num:u) {
			if(num!=0) System.out.print(num+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n = sc.nextInt();
		System.out.println("Enter the value for m");
		int m = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the values for array a of size "+n);
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[m];
		System.out.println("Enter the values for array b of size "+m);
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		union(a,b,n,m);
	
	}
	
	
}
