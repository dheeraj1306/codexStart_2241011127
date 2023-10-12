
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int changes=0;
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                changes+=1;
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        // for(int num:arr){
        //     System.out.println(num+" ");

        // }
        System.out.println("minimun no of changes"+changes);
        
    }


}