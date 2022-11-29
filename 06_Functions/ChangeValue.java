import java.util.Arrays;

//In Java we donnot have call by reference
//Call by value

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 3, 4, 5 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make change to the object via this ref var, same obj will be changed
    }
}
