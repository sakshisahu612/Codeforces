import java.util.*;
public class BalancedRound{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();  //NO. OF TEST CASES
        for(int i = 0 ; i<t ; i++){
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j<arr.length ; j++){
                arr[j] = scn.nextInt();
            }
            int count = 1;
            int counter = 1;
            Arrays.sort(arr);
            for(int a = 1 ; a<arr.length ; a++){
                if(arr[a]-arr[a-1]<=k){
                    counter++;
                    count = Math.max(count,counter);
                }
                else{
                    counter = 1;
                }          
            }
            System.out.println(n-count);
        }
        scn.close();
    }
}
