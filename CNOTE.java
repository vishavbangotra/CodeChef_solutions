package codechef;

import java.util.Scanner;

public class CNOTE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int K = sc.nextInt();
			int N = sc.nextInt();
			int[] P = new int[N];
			int[] C = new int[N];
			boolean canBuy = false;
			
			for(int i=0; i<N; i++) {
				P[i] = sc.nextInt();
				C[i] = sc.nextInt();
			}
			for(int i=0; i<N; i++) {
				if(C[i] > K || P[i] < X-Y) 
					continue;
				else {
					canBuy = true;
					break;
					}
			}
			if(canBuy)
				System.out.println("LuckyChef");
			
			else System.out.println("UnluckyChef");
		}

	}

}
