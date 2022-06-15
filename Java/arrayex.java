import java.util.*;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class arrayex 
{
 public static void main(String[] args)
 {
    int[] myIntarray = {1,2,3,4,5,7,8};
    int index = 0;
    while (index<7)
    {
        System.out.print(myIntarray[index]);
        index++;
    }
    System.out.println("****************");
    for(index=0;index<7;index++)
    {
        System.out.print(myIntarray[index]);
    }
    System.out.println("****************");

    for (int element : myIntarray)
    {
        System.out.print(element);
    }
 }
}
