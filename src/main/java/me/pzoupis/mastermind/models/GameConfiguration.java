package me.pzoupis.mastermind.models;

public class GameConfiguration {

    private int lengthOfCode;
    private int availableCodeItems;
    private boolean areDuplicateCodeItemsAllowed;
    
    public GameConfiguration(int lengthOfCode, int availableCodeItems, boolean areDuplicateCodeItemsAllowed) {
        this.lengthOfCode = lengthOfCode;
        this.availableCodeItems = availableCodeItems;
        this.areDuplicateCodeItemsAllowed = areDuplicateCodeItemsAllowed;
    }

    public int getLengthOfCode() {
        return lengthOfCode;
    }

    public int getAvailableCodeItems() {
        return availableCodeItems;
    }
    
    public boolean getAreDuplicateCodeItemsAllowed() {
        return areDuplicateCodeItemsAllowed;
    }

    public void setLengthOfCode(int lengthOfCode) {
        this.lengthOfCode = lengthOfCode;
    }

    public void setNumberOfAvailableCodeItems(int availableCodeItems) {
        this.availableCodeItems = availableCodeItems;
    }
    
    public void setAreDuplicateCodeItemsAllowed(boolean areDuplicateCodeItemsAllowed) {
        this.areDuplicateCodeItemsAllowed = areDuplicateCodeItemsAllowed;
    }
}
