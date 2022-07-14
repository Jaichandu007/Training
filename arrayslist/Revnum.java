import java.util.Scanner;
public class Revnum {
    // public static void Rev(int num,int rev){
    //    if (num%10 ==0)
    //    {
    //     return;
    //    }
    //    rev = num%10;
    //    System.out.println(rev);
    //    Rev(num,rev);

    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        
        int rev =0;
        while(num !=0 )
        {
            rev = num%10;
            System.out.print(rev);
            num = num/10;
            
        }
        System.out.println();
        
}
}
