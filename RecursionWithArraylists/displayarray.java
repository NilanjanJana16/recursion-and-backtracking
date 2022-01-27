package RecursionWithArraylists;
import java.io.*;
import java.util.*;


public class displayarray {

    public static void main(String[] args) throws Exception{

        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }

        displayreverse(arr, 0);
    }


    public static void displayreverse(int[] arr, int index){

        if(index == arr.length){
            return;
        }
        displayreverse(arr, index + 1);
        System.out.println(arr[index]);
    }



    
    
}
