public class ArrayInit {
    public static void main(String[] args){
        int array1[][] = {{1, 2, 3},{4, 5, 6,}};
        int array2[][] = {{3, 1},{5},{4, 5, 6}};
        System.out.println("The first Array is");
        outputArray(array1);

        System.out.println("The Second Array is");
        outputArray(array2);
    }
    public static void outputArray(int[][] array){
        for (int row=0;row<array.length;row++)
        {
            for ( int column = 0; column < array[row].length;column++)
        System.out.printf("%d ",array[row][column]);
        System.out.println();    
        }
    }
    
}
