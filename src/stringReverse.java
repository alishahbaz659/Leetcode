public class stringReverse {

    public static void stringReverse(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        stringReverse(arr);
    }
}
