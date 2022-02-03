package RecursionWithArrayList;

import java.io.*;
import java.util.*;

public class mazepath {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();

        ArrayList<String> paths = getMazePaths(1,1,dr,dc);
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
        
        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> hpaths = new ArrayList<>();

        if(sr<dr){

            vpaths = getMazePaths(sr+1, sc ,dr,dc);

        }
        if(sc<dc){
            hpaths = getMazePaths(sr,sc+1,dr,dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String val: hpaths){
            paths.add("h" + val);
        }

        for(String val: vpaths){
            paths.add("v" + val);
        }

        return paths;

    }

}