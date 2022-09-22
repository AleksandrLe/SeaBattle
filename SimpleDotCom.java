package LearningJava.Chapter5_SeaBattle_Lite;

class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    String checkYourself(String stringGuess) {
        String result = "";
        int guess = Integer.parseInt(stringGuess);
        for (int i = 0; i< locationCells.length; i++) {
            if (guess == locationCells[i]) {
                result = "hit!";
                locationCells[i] = 999;
                numOfHits++;
                break;
            } else {
                result = "miss(";
            }
        }

        if (numOfHits == locationCells.length) {
            result = "SINK!!!!!";
        }

        return result;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
