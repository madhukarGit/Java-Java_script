package strings;

public class Creation {
    public static void main(String[] args) {
        /*
        * basic method to create is String s = ""; with literals
        * */

        String s1 = "abc"; // with literals , internal reference pool of string objects
        String vegetable = new String("aubergine"); // with new keyword, always creates a new string reference

        s1.concat(vegetable);

    }
}
