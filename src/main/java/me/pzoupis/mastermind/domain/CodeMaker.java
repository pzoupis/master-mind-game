package me.pzoupis.mastermind.domain;
import me.pzoupis.mastermind.interfaces.ICodeMaker;
import me.pzoupis.mastermind.models.GameConfiguration;

public class CodeMaker implements ICodeMaker {
    
    private GameConfiguration gameConfiguration;
    
    public CodeMaker() {
        
    }
    
    @Override
    public void setGameConfiguration(GameConfiguration gameConfiguration) {
        this.gameConfiguration = gameConfiguration;
    }
    
    @Override
    public int[] generateCode() {
        int length = gameConfiguration.getLengthOfCode();
        int[] code = new int[length];
        for(int i = 0; i < length; i++) {
            code[i] = getRandomDigit();
        }
        return code;
    }
    
    private int getRandomDigit() {
        int availableCodeItems = gameConfiguration.getAvailableCodeItems();
        return (int) (availableCodeItems * Math.random() + 1);
    }
}
