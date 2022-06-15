import java.util.*;
public class AccountTest{
    public static void main(String[] args){
        Account account1 = new Account("jai", 50.00);
        Account account2 = new Account("Jc", 100);

        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());


        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1 ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());


        System.out.printf("Enter deposit amount for account2 ");
        depositAmount = input.nextDouble();
        
        System.out.printf("%n adding %.2f to account balance %n%n",depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

    }
}