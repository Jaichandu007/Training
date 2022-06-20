import java.util.Scanner;

class Ans1{
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st integer");
        a = input.nextInt();
        System.out.println("enter 2nd integer");
        b = input.nextInt();
        if(a>b){
            System.out.printf("%d is larger\n",a);
        }
        else if(b>a){
            System.out.printf("%d is larger\n",b);
        }
        else{
            System.out.println("These numbers are equal");
        }
        
    }
}

class Ans2 {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        number = input.nextInt();
        if ((number >= 10000) && (number <= 99999)){
            System.out.printf("%d   ", (number/10000));
            System.out.printf("%d   ", (number/1000)%10);
            System.out.printf("%d   ", (number%100)%10);
            System.out.printf("%d   ", (number%100)/10);
            System.out.printf("%d   ", (number%10));
        }
        if (number < 10000){
            System.out.println("The number you entered is smaller than five digits");
        }
        if (number > 99999){
            System.out.println("The number you entered is greater than five digits");
        }

    }
}

class Ans3{
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



