package RecursionWithArrayList;

import java.io.*;
import java.util.*;

public class getstairs {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n==0){
            ArrayList<String> blankpath = new ArrayList<>();
            blankpath.add("");
            return blankpath;
        }else if(n<0){
            ArrayList<String> nopath = new ArrayList<>();
            return nopath;
        }


        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> fpath = new ArrayList<>();

        for(String val: paths1){
            fpath.add(1+val);
        }
        for(String val: paths2){
            fpath.add(2+val);
        }
        for(String val: paths3){
            fpath.add(3+val);
        }

        return fpath;
        
    }

}
