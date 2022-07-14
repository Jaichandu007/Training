import java.util.Scanner;
public class Quuen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinates of queen ");
        int x = sc.nextInt();
        System.out.println("Enter the y-coordinates of queen ");
        int y = sc.nextInt();
        
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(i==x || j==y || i-j==x-y || i+j ==x+y)
                {
                    System.out.print(" x ");
                }
                
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        
    }
  
    
}
