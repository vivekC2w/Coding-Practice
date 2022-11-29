import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // trim() will remove extra white-spaces from front and back both sides
        // charAt(index) -> gives the character at given index
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch < 'z')
            System.out.println(ch + " Is Lower case character");
        else if (ch >= 'A' && ch < 'Z')
            System.out.println(ch + " Is Upper case character");
        else
            System.out.println("Charcter is not Alphabet");

    }
}

/*
 * %
 * Charcter is not Alphabet
 * H
 * H Is Upper case character
 * h
 * h Is Lower case character
 */