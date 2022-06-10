import java.util.*;
public class Scanner_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,sum;
        System.out.println("enter 1st");
        num1 = input.nextInt();
        System.out.println("enter 2nd");
        num2 = input.nextInt();
        System.out.println("enter 3rd");
        num3 = input.nextInt();
        sum = num1+num2+num3;
        System.out.printf("sum is %d%n",sum);
    }
    
}
