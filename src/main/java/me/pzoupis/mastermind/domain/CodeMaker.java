package me.pzoupis.mastermind.domain;

public class CodeMaker {
    
    public int[] generateCode() {
        int[] code = new int[4];
        for(int i = 0; i < 4; i++) {
            code[i] = getRandomDigit();
        }
        return code;
    }
    
    public int getRandomDigit() {
        return (int) (6 * Math.random() + 1); 
    }
}
