import java.util.*;
public class NewYear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int x2 = scn.nextInt();
        int x3 = scn.nextInt();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(x1>x2 && x1>x3){
            max = x1;
        }
        else if(x2>x3 && x2>x1){
            max = x2;
        }
        else{
            max = x3;
        }
        if(x1<x2 && x1<x3){
            min = x1;
        }
        else if(x2<x3 && x2<x1){
            min= x2;
        }
        else{
            min = x3;
        }
        System.out.println(max-min);
    }
}
