package RecursionWithArraylists;
import java.io.*;
import java.util.*;

public class lastindex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int ans = lastIndex(arr,0,x);
        System.out.println(ans);


    }

    public static int lastIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length){
            return -1;
        }

        int lastin = lastIndex(arr, idx+1, x);

        if(lastin == -1){
            if(arr[idx] == x){
                return idx;
            }else{

                return -1;
            }
        }else{

            return lastin;
        }
        
    }

}


