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
        while(number<10000 || number>99999){
            System.out.println("enter a five digit number please");
            number = input.nextInt();
        }
        int [] arr = new int[5];
      

            for(int i=0; i<5; i++){
                arr[i] = number%10;
                number = number/10;
            }
        
            for(int a=0; a<5; a++){
                System.out.print(arr[4-a] + " ");
            }
    
    }
    
}

class Ans3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int No_of_Pos=0 , No_of_Neg=0 , No_of_Zeros=0;
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
        if(arr[i] < 0)
        {
            No_of_Neg++;
        }
        else if ( arr[i] > 0)
        {
            No_of_Pos++;
        }
        else 
        {
            No_of_Zeros++;
        }
    }
        System.out.println();
        System.out.printf("Total postive numbers: %d\n", No_of_Pos);
        System.out.printf("Total negative numbers: %d\n", No_of_Neg);
        System.out.printf("Total zero numbers: %d\n", No_of_Zeros);
    }
}


public class Ans5 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
    System.out.println("Enter Size");
	
    int size = sc.nextInt();

		for (int i = 1; i <=size; i++) {
			for (int j = 1; j <= size; j++) 
				if((i==1 || i==size) || (j==1 || j==size))
					System.out.print("* ");
				else
					System.out.print("  ");
			
			System.out.println();
        }
    }

}



class Ans6 {
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        number = input.nextInt();
        while(number<10000 || number>99999){
            System.out.println("enter a five digit number please");
            number = input.nextInt();
        }
        int [] arr = new int[5];

        for(int i=0; i<5; i++){
                arr[i] = number%10;
                number = number/10;
            }

                if(arr[0]== arr[4] && arr[1]== arr[3])
                {
                    System.out.println("It is a palindrome");
                }
                else
                {
                    System.out.println("Not a palindrome");
                }
    }
    
}



class Ans7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter Range");
        int Range = input.nextInt();
        if(Range < 500)
        {
        for(int a=1;a<Range;a++)
        {
            for(int b=1;b<Range;b++)
            {
                for(int c=1;c<Range;c++)
                {
                    if(c==Math.sqrt((Math.pow(a, 2)+(Math.pow(b, 2)))) && a<b)
                    {
                        System.out.printf("%d %d %d \n",a,b,c);
                    }
                }
            }
        }
    
    }
    else
    {
        System.out.println("Get lost");
    }
}
}



class Ans8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int fact= 1;
        for(int i=0;i<num;i++)
        {
            fact = (fact)*(num-i);
            
        }
        System.out.println(fact);
    }
    
}
