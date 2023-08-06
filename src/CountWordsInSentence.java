public class CountWordsInSentence {


    public static int wordsCounter(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        int count = 1; //start with 1 count
        for (int i = 0; i < sentence.length() ; i++) {
            if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String inputString = "Ali Shahbaz";
        System.out.println("Count of sentences are: " + wordsCounter(inputString));
    }

}
