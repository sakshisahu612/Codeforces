import java.util.*;
public class TenWords {
    public static void main(String[] args)
{
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i = 0; i<t; i++){
        int n = scn.nextInt();
        int[][] array = new int[n][2];
        for(int r = 0; r<n;r++){
            for(int c = 0; c<2; c++){
                array[r][c] = scn.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int a = -1;
         for(int x = 0; x<n; x++){
                if(array[x][0]<=10 && array[x][1]>max ){
                    max = array[x][1];
                    a = x;
              
            }            
        }
        System.out.println(a+1);
    }
    scn.close();
}    
}
