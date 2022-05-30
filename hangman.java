import java.util.Scanner;
public class hangman {

    public static void main(String[] args) {
        System.out.println("lets start");

        while (true) {
            int lives = 5; // <-- ilość żyć
            String[] words = new String[]{"banana", "mouse", "window", "layout", "beach", "house", "database", "books"
            };
            String randword = words[(int) (Math.random() * words.length)]; // <-- losowanie  losowego słowa z tablicy
            System.out.println("in the word is " + randword.length() + " " + "letters");
            char[] letters = new char[randword.length()]; //<-- "przechwycenie " słowa poczym  zaszyfrowanie go
            for (int i = 0; i < letters.length; i++) {
                letters[i] = '#';//<---
            }

            Scanner scan = new Scanner(System.in);



            while (lives > 0) {
                System.out.println("lives :");

                for (int i = 0; i < lives; i++) {
                    System.out.println("\uD83E\uDDE1");

                }
                System.out.println();

                System.out.print("enter word:  ");

                String enterinp = scan.nextLine();
                char letter = enterinp.charAt(0);

                boolean isGusCor = false;
                for (int i = 0; i < randword.length(); i++) { //<-- w uproszczeniu logika  deszyfracji
                    char l = randword.charAt(i);
                    if (l == letter) {
                        letters[i] = l;
                        isGusCor = true;
                    }
                }
                if (!isGusCor) {
                    lives = lives - 1;

                }
                boolean isgamend = true;
                System.out.print("word: ");
                //<<

                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == '#') {  // <-- jeśli w słowie pozostała zaszyfrowana litera gra trwa dalej chyba że skończyły się życia
                        isgamend = false;
                    }

                    System.out.print(letters[i]);
                }

                System.out.println();
                System.out.println("+++++++++++++++++++++++++++++++++++++++++");
                if (isgamend) {
                    System.out.println("you won");
                    break;
                }
            }
            if (lives == 0) {
                System.out.println("wasted , the word was " + randword);
            }
            System.out.println("eixt game");

            System.out.println("do you want play again? enter yes uf you want play again or sometching else if you want  to quit ");
            String Checkanserw = scan.nextLine();
        if (Checkanserw.equals("yes")){
            System.out.println("ok");
        }else{
            break;
        }
        }
    }
}