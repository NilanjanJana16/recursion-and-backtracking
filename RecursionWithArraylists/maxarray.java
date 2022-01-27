package RecursionWithArraylists;
import java.io.*;
import java.util.*;

public class maxarray {

    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = arraymax(arr, 0);
        System.out.print(max);
    }

    public static int arraymax(int[] arr, int index){

        if(index == arr.length-1){
            return arr[index];
        }

        int smallarr = arraymax(arr, index+1);
        
        if(smallarr > arr[index]){
            return smallarr;
        }else{
            return arr[index];
        }

    } 

}