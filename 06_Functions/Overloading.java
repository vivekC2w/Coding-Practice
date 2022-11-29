
//functions having same fun name but diff arguments
public class Overloading {
    public static void main(String[] args) {
        fun(007);
        fun("James Bond");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String str) {
        System.out.println(str);
    }
}
