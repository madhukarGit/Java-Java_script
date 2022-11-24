package strings;

public class CompareTo {
    public static void main(String[] args) {
        /*
        *
        * Java method for comparision is compareTo
        *
        * */

        String s1 = "Pond";
        String s2 = "pond";
        int result = compareString(s1,s2);
        System.out.println(result);
    }

    private static int compareString(String s1, String s2){
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();

        int min = Math.min(b1.length,b2.length);
        for(int i = 0 ; i < min ; i++){
            if(b1[i] != b2[i]){
                return (char)b1[i] - (char)b2[i];
            }
        }

        return b1.length - b2.length;

    }
}
