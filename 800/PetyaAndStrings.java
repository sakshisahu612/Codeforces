import java.util.*;
public class PetyaAndStrings{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        //scn.nextLine();
        String str2 = scn.nextLine();
        boolean check = str1.equalsIgnoreCase(str2);
        if(check == true){
            System.out.println(0);
        }
        else{
            if(str1.compareToIgnoreCase(str2)<0){
                System.out.println(-1);

            }
            else{
                System.out.println(1);
            }
    
        }
        scn.close();
    }

}
