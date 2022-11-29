public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "vivek";

        {
            // You can not initialize variable again
            // int a =78;
            a = 78; // you can change the value
            System.out.println(a); // 78
            int c = 99;
            // value initialized in this block will remian in this block only
            name = "jayesh";
        }

        System.out.println(a); // 78
        System.out.println(name); // jayesh
        // System.out.println(c); //cannot use outside the block

    }
}
