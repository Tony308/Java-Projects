public class StringManipulation {


    public String checkString(){
        String result = "";
        String input = null;
        input = "Deep episodes of Deep Space Nine came on the television only after the news.";
        String[] list = input.split(" ");
        String[] newList = new String[list.length-1];
        String temp = "";
        System.out.println(list);
        int counter = 1;
        for (int x = 1; x < list.length; x++) {

            String first = list[x-1].substring(list[x-1].length()-2,list[x-1].length());
            String second = list[x].substring(0,2);

            if (first.equals(second)) {
                temp = list[x-1] + list[x].substring(2,list[x].length());
                newList[x-1] = temp;
                x++;
                counter++;
            } else {
                temp = list[x-1];
                newList[x-counter] = temp;
            }
        }

        for (int y = 0; y < newList.length; y++) {
            result = result   + newList[y] + " ";
        }

        return result;
    }
}
