import java.util.*;
public class methods2 {
       public static void main(String[] args)
    {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        // Scanner input2 = new Scanner(System.in);
        b = input.nextInt();
        Add(a,b);
        Multi(a,b);
    }

        public static void Add(int a , int b){
            System.out.println(a+b);
            }
            public static void Multi(int a , int b){
            System.out.println(a*b);
            }
        
        
    }

