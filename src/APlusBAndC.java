import java.util.Scanner;
import java.math.*;
public class APlusBAndC{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i=0;i<t;i++){
            BigInteger a=s.nextBigInteger();
            BigInteger b=s.nextBigInteger();
            BigInteger c=s.nextBigInteger();
            BigInteger sum=a.add(b);
            if(sum.compareTo(c)>0)
            	System.out.println("Case #"+(i+1)+": true");
            else
                System.out.println("Case #"+(i+1)+": false");
        }         
    }
}