import java.util.ArrayList;
import java.util.Collections;

import org.omg.Messaging.SyncScopeHelper;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(7);
        list.add(4);
        list.add(1);
        System.out.println(list);
        list.add(1,9);
        list.add(2,3);
        System.out.println(list);
        int element = list.get(1);
        System.out.println(element);
        list.set(1,2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
