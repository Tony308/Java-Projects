import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MorseCode {


    public void morseToEnglish() {
        HashMap<String, Character> morseCode = new HashMap<String, Character>();
        String input = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

        morseCode.put(".-", 'a');
        morseCode.put("-...", 'b' );
        morseCode.put("-.-.",'c');
        morseCode.put("-..",'d');
        morseCode.put(".", 'e');
        morseCode.put("..-.",'f');
        morseCode.put("--.",'g');
        morseCode.put("....", 'h');
        morseCode.put("..",'i');
        morseCode.put(".---", 'j');
        morseCode.put("-.-", 'k');
        morseCode.put(".-..",'l');
        morseCode.put("--", 'm');
        morseCode.put("-.",'n');
        morseCode.put("---", 'o');
        morseCode.put( ".--.",'p');
        morseCode.put("--.-",'q');
        morseCode.put(".-.",'r' );
        morseCode.put("...",'s');
        morseCode.put("-", 't');
        morseCode.put("..-", 'u');
        morseCode.put("...-",'v');
        morseCode.put(".--", 'w');
        morseCode.put("-..-" ,'x' );
        morseCode.put("-.--",'y');
        morseCode.put("--..",'z');
        morseCode.put(".----", '1');
        morseCode.put("..---",'2');
        morseCode.put("...--",'3');
        morseCode.put("....-",'4');
        morseCode.put(".....",'5' );
        morseCode.put("-....",'6');
        morseCode.put("--...",'7');
        morseCode.put("---..",'8');
        morseCode.put("----.",'9' );
        morseCode.put("-----", '0' );
        morseCode.put("/", ' ');



        String[] morse = input.split(" ");

        for (int x = 0; x < morse.length;x++) {
            System.out.print(morseCode.get(morse[x]));
        }
        System.out.println();
    }




    public void englishToMorse() {

        HashMap<Character, String> morseCode = new HashMap<Character, String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        morseCode.put('a', ".-");
        morseCode.put('b', "-...");
        morseCode.put('c',  "-.-");
        morseCode.put('d',  "-..");
        morseCode.put('e',    ".");
        morseCode.put('f', "..-.");
        morseCode.put('g',  "--.");
        morseCode.put('h', "....");
        morseCode.put('i',   "..");
        morseCode.put('j', ".---");
        morseCode.put('k',   "-.");
        morseCode.put('l', ".-..");
        morseCode.put('m',   "--");
        morseCode.put('n',   "-.");
        morseCode.put('o',  "---");
        morseCode.put('p', ".--.");
        morseCode.put('q', "--.-");
        morseCode.put('r', ".-.");
        morseCode.put('s',  "...");
        morseCode.put('t',   "-");
        morseCode.put('u',  "..-");
        morseCode.put('v', "...-");
        morseCode.put('w',  ".--");
        morseCode.put('x', "-..-");
        morseCode.put('y', "-.--");
        morseCode.put('z', "--..");
        morseCode.put('1', ".----");
        morseCode.put('2',"..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");
        morseCode.put('0', "-----");

        int counter = 0;

        do {
            System.out.print(morseCode.get(input.charAt(counter)));
            counter++;
        } while (counter < input.length());

    }
}
