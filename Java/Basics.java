import java.util.Scanner;
import java.lang.Math;
public class Basics{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 numbers");
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = input.nextInt();
            arr[i] = (int) Math.pow(arr[i], (int)3);
        }

        for(int i=0;i<5;i++)
        {
            
            System.out.print(arr[i] + " ");
        }

        
    }
}