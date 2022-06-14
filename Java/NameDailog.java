import javax.swing.JOptionPane;
import java.util.*;
import java.util.MissingFormatArgumentException;
public class NameDailog {
    public static void main(String[] agrs){
        String name = JOptionPane.showInputDialog("what is your name");
        String message = String.format("Welcome, %s, to Java Programming");
        JOptionPane.showMessageDialog(null, message);
        
    }
  
}
