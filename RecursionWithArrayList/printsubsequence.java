package RecursionWithArrayList;

import java.util.Scanner;

public class printsubsequence {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSubSS(str, "");
        
    }

    public static void printSubSS(String ques, String ans) {

        if(ques.length() == 0){
            System.oput.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String remQues = ques.substring(1);

        printSubSS(remQues, ans+ ch);
        printSubSS(remQues, ans + "");
        
        
    }
    

     
}
