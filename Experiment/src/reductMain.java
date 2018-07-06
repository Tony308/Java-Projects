import java.util.ArrayList;

public class reductMain {



    public static void main(String[] args) {
        String[] inputs = { "I heard the pastor sing live verses easily.",
                "Deep episodes of Deep Space Nine came on the television only after the news.",
                "Digital alarm clocks scare area children." };
        System.out.println(stringReduc(inputs));

    }

    public static String stringReduc(String[] sArray) {

        String finalOutput = "";

        for (int x = 0; x < sArray.length; x++) {

            String[] words = sArray[x].split(" ");

            for (int i = 1; i < words.length; i++) {

                int letterCount = 1;

                int highestValidLetterCount = 0;

                while (letterCount <= words[i - 1].length() && letterCount <= words[i].length()) {

                    if (words[i - 1].substring(words[i - 1].length() - letterCount, words[i - 1].length())
                            .equals(words[i].substring(0, letterCount)))

                        highestValidLetterCount = letterCount;

                    letterCount++;
                }

                if (highestValidLetterCount > 0 && i == words.length - 1) {

                    finalOutput += words[i - 1].substring(0, words[i - 1].length() - highestValidLetterCount) + " "
                            + words[i].substring(highestValidLetterCount);
                }

                else if (i == words.length - 1) {
                    finalOutput += words[i - 1] + " " + words[i];
                } else if (highestValidLetterCount > 0) {
                    finalOutput += words[i - 1].substring(0, words[i - 1].length() - highestValidLetterCount);
                } else {
                    finalOutput += words[i - 1] + " ";
                }
            }

        }
        return finalOutput;
    }
}
