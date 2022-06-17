import org.omg.CORBA.SystemException;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Time1Test {
public static void main(String[] args){
    Time1 time = new Time1();
    System.out.printf("After time object is created",time);
    time.setTime(5,23,6);
    System.out.printf("After calling set Time,time");
    
    try
    {
        time.setTime(99,99,99);
    }
    catch(IllegalArgumentException e)
    {
        System.out.printf("Execption : %s%n%n", e.getMessage());
    }
    System.out.printf("time is ",time);
    }    
}
