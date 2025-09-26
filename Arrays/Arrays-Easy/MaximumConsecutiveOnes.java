
import java.util.Scanner;

public class MaximumConsecutiveOnes {
	
	public static void mx(int[] a) {
		
		int n=a.length;
		int maxi = 0;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(a[i] == 1) {
				cnt++;
			}
			maxi = Math.max(maxi,cnt);
		}
		System.out.println("The maximum consecutive ones are "+maxi);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value for the n ");
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    System.out.println("Enter the values into the array of the size "+n);
	    for(int i=0;i<n;i++) {
	    	a[i] = sc.nextInt();
	    }
	    mx(a);
	}

}
