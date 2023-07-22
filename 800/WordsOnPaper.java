import java.util.*;
public class WordOnThePaper {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i<t ; i++){
            char[][] array = new char[8][8];
            for(int r = 0; r<8; r++){
                String inp = scn.next();
                for(int c=0; c<8 ; c++){
                    array[r][c] = inp.charAt(c);
                }
            }

            for(int ro = 0; ro<8; ro++){
                for(int co=0; co<8 ; co++){
                    if(array[ro][co] != '.'){
                        System.out.print(array[ro][co]);
                    }
                    
                }
            }
            System.out.println();
        }
        scn.close();
    }
    
}
