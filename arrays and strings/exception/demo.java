import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class demo {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter values of I & J:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double i=input.nextInt();
        
        
        double k;
        int a [] = new int[4];
        try{
        double j=Integer.parseInt(br.readLine());            
         k = i/j;
         System.out.println(k);
        for (int z=0;z<=4;z++)
        {
            a[z] = z+1;
        }
        }
        catch (ArithmeticException e )
        {
            System.out.println("Can't be divided by Zero");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Only 4 elements are possible");
        }
        catch (Exception e)
        {
             System.out.println("Unknown exception");
        }
    }
}
