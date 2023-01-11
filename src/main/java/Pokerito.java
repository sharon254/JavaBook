public class Pokerito {
    public static void main(String[]args){


    }
    public static char randomCard(){
        //*   1. Gets a random number between 1 and 13
        int min =1;
        int max = 13;
        int guessedNumber= (int) (Math.floor(Math.random() * max - min +1) + min);
        // 2. Returns a card that matches the random number.
        return 's';

    }
}
