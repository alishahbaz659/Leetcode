public class UniqueString {


    public static boolean uniqueCharacters(String input) {

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String input = "abcdefb";
        if (uniqueCharacters(input)) {
            System.out.println("It contain unique characters");
        } else {
            System.out.println("It does not contain unique characters");
        }
    }
}
