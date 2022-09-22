package LearningJava.Chapter5_SeaBattle_Lite;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        GameHelper gameHelper = new GameHelper();

        int numOfGuesses = 0;
        int startCell = (int) (Math.random() * 5);
        int[] location = {startCell, startCell + 1, startCell + 2};
        dot.setLocationCells(location);
        boolean isActive = true;

        while (isActive == true) {
            String userGuess = gameHelper.getUserInput("Enter a number: ");
            String result = dot.checkYourself(userGuess);
            System.out.println(result);
            numOfGuesses++;
            if (result.equals("SINK!!!!!")) {
                isActive = false;
                System.out.println("Number of attempts: " + numOfGuesses);
            }
        }
    }
}