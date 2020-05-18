package codechef;

import java.util.Scanner;

public class FLOW004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-->0){
			int sum = 0;
		    int n = input.nextInt();
		    sum = sum + n%10;
		    n = n/10;
		    while(n/10 != 0) {
		    	n = n/10;
		    }
		    sum = sum + n%10;
		    System.out.println(sum);
		}
		input.close();

	}
}
