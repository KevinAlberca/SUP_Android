import java.lang.Math;
import java.util.Scanner;

public class GuessIt {

    public static void main(String[] args) {
        int random = (int)(Math.random() * 100); // Genere un nombre aleatoir
        Scanner sc = new Scanner(System.in); // Valeur utilisateur
        int userInput = sc.nextInt(); // Recupere la valeur utilisateur en Int

        while (userInput != random) {
            if (userInput > random) {
                System.out.println("It's Less");
            } else {
                System.out.println("It's More");
            }
            System.out.print("Try again :");
            userInput = sc.nextInt();
        }

        System.out.println("YOU WIN !");
    }

}
