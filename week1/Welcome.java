import java.util.*;

public class Welcome {
    public static void main(String [] args) {
        // List<Integer> list = new ArrayList<Integer>();
        // list.add(1);
        // list.add(3);
        // System.out.println("Array List: " + list.toString());
        
        List<Integer> a = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        List<Integer> a2 = new ArrayList<Integer>() {{
            add((int)Math.pow(1, 2));
            add((int)Math.pow(2, 2));
            add((int)Math.pow(3, 2));
            add((int)Math.pow(4, 2));
        }};

        List<Integer> a3 = new ArrayList<Integer>() {{
            add((int)Math.pow(1, 3));
            add((int)Math.pow(2, 3));
            add((int)Math.pow(3, 3));
            add((int)Math.pow(4, 3));
        }};
        
        System.out.println("a " + "\ta^2 " + "\ta^3");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + "\t" + a2.get(i) + "\t" + a3.get(i));
        }
        
        
    }
}