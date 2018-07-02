public class BlackJack {

    public int blackJack(int num1, int num2) {
        int result = 0;
        if ( (21 - num1) < 0 || (21 - num2) < 0){
            result = 0;
        } else if ( (21 - num1 ) < (21 - num2) ){
            result = num1;
        } else if ((21 - num1) > ( 21 - num2) ){
            result = num2;
        }
        return result;
    }
}
