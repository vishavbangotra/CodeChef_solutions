package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class HORSES {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			long[] s = new long[n];
			
			for(int i=0; i<n; i++) 
			{
				s[i] = sc.nextLong();
			}
			long min = (s[1] - s[0]);
			Arrays.sort(s);
			for(int i=0; i<n-1; i++) {
				if(s[i+1] - s[i] < min)
					min = (s[i+1] - s[i]);
			}
			System.out.println(min);
			
		}
		sc.close();
	}
}
