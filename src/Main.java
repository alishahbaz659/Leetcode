import java.util.Scanner;

public class Main {

    public static String replaceSpace(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                stringBuilder.append("%");
            } else {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userIn = input.nextLine();
        System.out.println("Converted Input is: " + replaceSpace(userIn));

    }
}