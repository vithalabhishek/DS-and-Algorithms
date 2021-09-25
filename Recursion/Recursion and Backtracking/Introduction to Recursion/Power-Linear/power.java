import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int p = power(x,n);
        System.out.println(p);
        
    }

    public static int power(int x, int n){
    if(n==0) return 1;
    int pnf1 = power(x,n-1);
    int p = x*pnf1;
    return p;
    }

}