package me.pzoupis.mastermind.domain;

import me.pzoupis.mastermind.interfaces.ICodeMaker;

public class CodeMaker implements ICodeMaker {
    
    public int[] generateCode() {
        int[] code = new int[4];
        for(int i = 0; i < 4; i++) {
            code[i] = getRandomDigit();
        }
        return code;
    }
    
    private int getRandomDigit() {
        return (int) (6 * Math.random() + 1); 
    }
}
