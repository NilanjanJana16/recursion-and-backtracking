package RecursionWithArrayList;

import java.io.*;
import java.util.*;

public class mazepathjumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        
        getMazePaths(1,1,n,m,"");

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void getMazePaths(int sr, int sc, int dr, int dc, String psf) {


        if(sr == dr && sc == dc){

            System.out.println(psf);
            return;
            

        }

       
        
        //for horizontal moves
        for(int movesize = 1; movesize <= dc - sc; movesize++){
            getMazePaths(sr,sc+movesize,dr,dc, psf + "h" + movesize);
            
        }

        //for vertical moves
        for(int movesize = 1; movesize <= dr-sr; movesize++){
            getMazePaths(sr+ movesize, sc,dr,dc, psf + "v" + movesize);
            
        }

        //for diagonal moves
        for(int movesize = 1; movesize<= dr-sr && movesize <= dc-sc; movesize++){
            getMazePaths(sr+movesize, sc+movesize, dr ,dc, psf + "d" + movesize);
            
        }
      


        
    }

}
