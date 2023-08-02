public class ReplaceSpaces {

    public static String replaceSpaces(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                builder.append("%20");
            } else {
                builder.append(currentChar);
            }
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String inputString = "Replace every space in string";
        String replacedString = replaceSpaces(inputString);
        System.out.println("Replaced String: " + replacedString);
    }
}
