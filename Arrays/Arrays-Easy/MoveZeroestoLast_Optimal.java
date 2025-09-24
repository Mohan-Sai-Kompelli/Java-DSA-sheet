
import java.util.Scanner;

public class MoveZeroestoLast_Optimal {
	
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in the array of size "+n);
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int j=-1;
		for(int i=0;i<n;i++) {
			if(a[i] == 0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<n;i++) {
			if(a[i]!=0) {
				swap(a,i,j);
				j++;
			}
		}
		
		for(int num:a) {
			System.out.print(num+" ");
			
		}
	}
}
