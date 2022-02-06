package RecursionWithArrayList;
import java.io.*;
import java.util.*;

public class printKeyPadComb {

    public static void main(String[] args) throws Exception {

        Scanner scn  = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");
        
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String ques, String ans){

        //base case
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String remQues = ques.substring(1);

        String codeFORch = codes[ch - '0'];   //for ch 6 ascii value is 54, 0=48 so convert to ascii and then sub 54-48= 6

        for(int i =0; i < codeFORch.length(); i++){
            char val = codeFORch.charAt(i);
            printKPC(remQues, ans + val);
        }


    }
    
}
