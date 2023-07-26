import java.util.*;
public class Bit{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = 0;
        scn.nextLine();  // reads the empty line after taking input n as integr
        while(n>0){
            String s = scn.nextLine();
            if(s.charAt(1)== '+'){
                x +=1;
            }
            if(s.charAt(1)== '-'){
                x-=1;
            }
            n--;
        }
        System.out.println(x);
        scn.close();
    }
}
