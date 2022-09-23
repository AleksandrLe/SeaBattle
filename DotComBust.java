package LearningJava.Chapter6_SeaBattle.Hard;

import java.util.ArrayList;

public class DotComBust {
    GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOgGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three sites");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them with minimum number of attempts");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Make a move");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOgGuesses++;
        String result = "miss(";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Hit!!")) {
                break;
            }
            if (result.equals("SICK!!!")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All the sites have gone to the bottom! Your shares are worthless.");
        if (numOgGuesses <= 18) {
            System.out.println("It took you only " + numOgGuesses + " attempts.");
            System.out.println("You managed to get out before your investments sank.");
        } else {
            System.out.println("It took you quite a long time. " + numOgGuesses + " attempts.");
            System.out.println("Pisces dance around your investments.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
