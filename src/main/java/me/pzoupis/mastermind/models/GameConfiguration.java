package me.pzoupis.mastermind.models;

public class GameConfiguration {

    private int lengthOfCode;
    private int availableCodeItems;
    
    public GameConfiguration(int lengthOfCode, int availableCodeItems) {
        this.lengthOfCode = lengthOfCode;
        this.availableCodeItems = availableCodeItems;
    }

    public int getLengthOfCode() {
        return lengthOfCode;
    }

    public int getAvailableCodeItems() {
        return availableCodeItems;
    }

    public void setLengthOfCode(int lengthOfCode) {
        this.lengthOfCode = lengthOfCode;
    }

    public void setNumberOfAvailableCodeItems(int availableCodeItems) {
        this.availableCodeItems = availableCodeItems;
    }    
}
