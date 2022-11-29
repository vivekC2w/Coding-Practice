import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(12);
        // list.add(13);
        // list.add(14);
        // list.add(15);
        // list.add(16);

        System.out.println(list.contains(15)); // true
        // change the value at index 0
        list.set(0, 99);
        // remove the index at 2
        list.remove(2);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get the values
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        // System.out.println(list);
    }
}
