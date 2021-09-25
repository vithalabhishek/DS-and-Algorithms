import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int p = power(x,n);
        System.out.println(p);
        
    }

    public static int power(int x, int n){
        if(n==0) return 1;
        int pnf1 = power(x,n/2);      int p;
        if(n%2==0)
        {
           
            p = pnf1*pnf1;
        }
        else
        {
            p = pnf1*pnf1*x; 
        }
        return p;
        
    }

}