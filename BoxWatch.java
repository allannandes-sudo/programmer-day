import java.util.Scanner;

import static java.lang.System.*;

public class BoxWatch {
    public static void main(String[] args) {
        var boxes = 50;
        var awardBox = randomBox(boxes);
        var sc = new Scanner(in);
        int userChoice = -1;
        do {
            out.println("Choose your box number between 1 and " + boxes);
            userChoice = sc.nextInt();
        } while (userChoice < 0 || userChoice >= boxes);
        int anotherChoice;
        do {
            anotherChoice = randomBox(boxes);
        } while (anotherChoice == userChoice);
        out.println("Do you want to change your box?(s/n)");
        var wantToChange = sc.next();
        if ("s".equalsIgnoreCase(wantToChange)) {
            userChoice = anotherChoice;
        }
        if (userChoice == awardBox) {
            out.println("Congratulations! You won the Watch.");
        } else {
            out.println("Sorry, you can try next time.");
            out.println("The award box is " + awardBox);
        }
    }
    private static int randomBox(int boxes) {
        return (int) Math.floor(Math.random() * boxes) + 1;
    }
}