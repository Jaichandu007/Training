import java.util.*;
public class AccountTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // int acc;
        Account myAccount = new Account();
        System.out.printf("Intial name is: %s%n%n", myAccount.getName());
        System.out.println("Please enter the name");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
    }


