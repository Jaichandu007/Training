import java.util.*;
public class Ans3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        int No_of_Pos=0 , No_of_Neg=0 , No_of_Zeros=0;
        System.out.println("Enter 5 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        if(num1 > 0)
            No_of_Pos=No_of_Pos+1;
        if(num2 > 0)
            No_of_Pos=No_of_Pos+1;
        if(num3 > 0)
            No_of_Pos=No_of_Pos+1;
        if(num4 > 0)
            No_of_Pos=No_of_Pos+1;
        if(num5 > 0)
            No_of_Pos=No_of_Pos+1;

        if(num1 < 0)
            No_of_Neg=No_of_Neg+1;
        if(num2 < 0)
            No_of_Neg=No_of_Neg+1;
        if(num3 < 0)
            No_of_Neg=No_of_Neg+1;
        if(num4 < 0)
            No_of_Neg=No_of_Neg+1;
        if(num5 < 0)
            No_of_Neg=No_of_Neg+1;

        if(num1==0)
            No_of_Zeros=No_of_Zeros+1;
        if(num2==0)
            No_of_Zeros=No_of_Zeros+1;
        if(num3==0)
            No_of_Zeros=No_of_Zeros+1;
        if(num4==0)
            No_of_Zeros=No_of_Zeros+1;
        if(num5==0)
            No_of_Zeros=No_of_Zeros+1;

        System.out.println();
        System.out.printf("Total postive numbers: %d\n", No_of_Pos);
        System.out.printf("Total negative numbers: %d\n", No_of_Neg);
        System.out.printf("Total zero numbers: %d\n", No_of_Zeros);
    }
}
