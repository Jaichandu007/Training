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
