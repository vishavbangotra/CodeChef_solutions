import java.util.*;


public class index {
    public static void main(String[] args){
        long rmax=0, t;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] budget = new long[N];
        for(int i=0; i<N; i++)
        {
            budget[i] = scan.nextLong();
        }
        Arrays.sort(budget);
        for(int i=0; i<N; i++)
        {
            t = budget[i]*(N-i);
            if(t>rmax)
                rmax = t;
        }
        System.out.print(rmax);
    }
}