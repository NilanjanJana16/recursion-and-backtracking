/*Q. Here are a few sets of inputs and outputs for your reference
Input1 -> 1
Output1 -> 1 1 1

Input2 -> 2
Output2 -> 2 1 1 1 2 1 1 1 2

Input2 -> 3
Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 */

package intro;

public class zigzag {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pzz(n);

    }

    public static void pzz(int n){

        if(n==0){
            return;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);        
        System.out.print(n);

        
    }
    
}
