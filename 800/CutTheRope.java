import java.util.*;
public class CutTheRope {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int j = 0; j<t ; j++){
            int n = scn.nextInt();
            int count = 0;
            for(int i =0; i<n ; i++){
                int a = scn.nextInt();
                int b = scn.nextInt();
                    if(a>b){
                        count++;
            }}
            System.out.println(count);
      
    }
      scn.close();    
    }
    
}
