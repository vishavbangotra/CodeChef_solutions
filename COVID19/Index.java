import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner; 


public class Index {
    public static void main(String [] args){
        
        int covid_i = 1;
        int i=0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            if (scanner.hasNextInt()) {
                arr[i]=scanner.nextInt();
                i++;
            }
        }


        for(int j=0; i<arr.length-1; j++){
            if(arr[j] - arr[j+1] == Math.abs(2)){
                covid_i++;
            }

        }
        scanner.close();
    }

}