package RecursionWithArrayList;

import java.io.*;
import java.util.*;

public class mazepathjumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {


        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;

        }

        ArrayList<String> paths = new ArrayList<>();
        
        //for horizontal moves
        for(int movesize = 1; movesize <= dc - sc; movesize++){
            ArrayList<String> hpaths = getMazePaths(sr,sc+movesize,dr,dc);
            for(String val: hpaths){
                paths.add("h" + movesize+ val);
            }
        }

        //for vertical moves
        for(int movesize = 1; movesize < dr-sr; movesize++){
            ArrayList<String> vpaths = getMazePaths(sr+ movesize, sc,dr,dc);
            for(String val: vpaths){
                paths.add("v" + movesize+ val);
            }
        }

        //for diagonal moves
        for(int movesize = 1; movesize<= dr-sr && movesize <= dc-sc; movesize++){
            ArrayList<String> dpaths = getMazePaths(sr+movesize, sc+movesize, dr ,dc);
            for(String val: dpaths){
                paths.add("d" + movesize + val);
            }
        }

        return paths;


        
    }

}
