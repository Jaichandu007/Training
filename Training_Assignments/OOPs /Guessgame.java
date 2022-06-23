import java.util.Scanner;

public class Guessgame {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int min = 0;
    int max = 9;
    int num = (int) (Math.random()*(max-min+1)+min);
    int P1,P2,P3;
    // Player P1 = new Player("Player1");
    // Player P2 = new Player("Player2");
    // Player P3 = new Player("Player3");

    System.out.println("Press enter to start the game");
    System.out.println("Guess the number");

    P1 = input.nextInt();
    P2 = input.nextInt();
    P3 = input.nextInt();
    while(true)
    if(P1 == num)
    {
        System.out.println("Player1 won the game");
        System.out.printf("Number is %d\n ",num);
        break;
    }
    else if (P2 == num)
    {
        System.out.println("Player2 won the game");
        System.out.printf("Number is %d\n ",num);
        break;
    }
    else if (P3 == num)
    {
        System.out.println("Player3 won the game");
        System.out.printf("Number is %d\n ",num);
        break;
    }
    else
    { 
    P1 = input.nextInt();
    P2 = input.nextInt();
    P3 = input.nextInt();
    }

}
}