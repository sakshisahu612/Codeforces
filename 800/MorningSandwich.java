import java.util.*;
public class MorningSandwich{
    public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            for(int i = 0; i<t ; i++){
                int b = scn.nextInt();
                int c = scn.nextInt();
                int h = scn.nextInt();
                int slice = c+h;
            if(b>slice){
                System.out.println((Math.min(b,slice))*2 + 1);
            }
            else{
                System.out.println((Math.min(b,slice))*2 - 1);
            }
            }
            
    }
}
