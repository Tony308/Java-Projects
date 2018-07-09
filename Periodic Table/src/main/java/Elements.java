import java.util.HashMap;

public class Elements {

    static HashMap<String, String> elements;

    Elements() {
        elements = new HashMap<String, String>();
    }

    public boolean checkElementName(String element, String initial){

        String lowerElement = element.toLowerCase();
        String lowerInitial = initial.toLowerCase();

        int first = lowerElement.indexOf(lowerInitial.charAt(0));
        int second = lowerElement.lastIndexOf(lowerInitial.charAt(1));

        //Checks if the first character is uppercase
        if (initial.charAt(0) != initial.toUpperCase().charAt(0)) {
            return false;
        }//Checks if second character is upper case.
        if (initial.charAt(1) == initial.toUpperCase().charAt(1)) {
            return false;
        }
        if (initial.length() != 2) {
            return false;
        }

        //Checks if the character exists in string. returns -1 if it doesn't
        if (first == -1) {
            return false;
        } else if (lowerElement.indexOf(lowerInitial.charAt(0)) != -1) {
            if (second != -1 && first < second ) {
                return true;
            }
        }
        return false;
    }

    public String preference(String element) {

        char[] list = element.substring(0,2).toCharArray();
        String b = new String(list);

        if (!Elements.elements.containsKey(b)) {
            elements.put(b, element);
            return b;
        }

        for (int y = 1; y < list.length;y++) {
            for (int x = 1; x < element.length();x++) {
                if (Elements.elements.containsKey(b)) {
                    list[y] = element.charAt(x);
                    b = new String(list);
                }
            }
        }

        list[0] = Character.toUpperCase(list[0]);
        b = new String(list);
        Elements.elements.put(b, element);
        System.out.println(Elements.elements.toString());
        return b;
    }

    public String generateElementName(String element) {

        String result = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        element.toLowerCase();
        for (int x = 0; x < alphabet.length;x++) {
            //if letter exists and result length less than 2
            if (element.indexOf(alphabet[x]) != -1 && result.length() < 2) {
                result += result + alphabet[x];
            }
        }

//        if (element.lastIndexOf(alphabet[x]) != -1 && result.length() < 2) {
//            result += result + alphabet[x];
//        }
        return result;
    }


}