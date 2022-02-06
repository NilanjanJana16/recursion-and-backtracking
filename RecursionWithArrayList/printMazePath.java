package RecursionWithArrayList;
import java.io.*;
import java.util.*;

public class printMazePath {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        printMaze(1,1,n,m,"");
                     
       }

    public static void printMaze(int sr, int sc, int dr, int dc, String ans ) {
        
        if(sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }
        
        //hortizontal move
        if(sc<dc){
        printMaze(sr, sc, dr, dc, ans);
        }
        //vertical move
        if(sr<dr){
            printMaze(sr, sc, dr, dc, ans);
        }
    }  
    
}
