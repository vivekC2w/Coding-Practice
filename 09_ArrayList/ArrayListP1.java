import java.util.ArrayList;

public class ArrayListP1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(45);
        al.add(78);
        al.add(90);
        al.add(1);

        System.out.println(al);
        int sum = sumOfElements(al);
        System.out.println(sum);
    }

    public static int sumOfElements(ArrayList<Integer> al) {

        int sum = 0;
        for (int ele : al) {
            sum += ele;
        }

        return sum;
    }
}

/*
 * [12, 45, 78, 90, 1]
 * 226
 */