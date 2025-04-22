public class ShortestWord {
    public static void main(String[] args) {
        String sentence = "Find the shortest word in this sentence";
        String[] words = sentence.split(" ");
        String shortestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }

        System.out.println("The shortest word is: " + shortestWord);
    }
}
