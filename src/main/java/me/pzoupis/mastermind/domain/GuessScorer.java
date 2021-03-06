package me.pzoupis.mastermind.domain;

import me.pzoupis.mastermind.interfaces.IGuessScorer;

public class GuessScorer implements IGuessScorer {
    private int[] code;
    
    public GuessScorer() {
        
    }
    
    @Override
    public void setCode(int[] code) {
        this.code = code;
    }
    
    @Override
    public int[] score(int[] guess) {
        int[] validation = new int[2];
        int rightItemsInRightPosition = calculateRightItemsInRightPosition(guess);
        int rightItemsInWrongPosition = calculateRightItemsInWrongPosition(guess, rightItemsInRightPosition);
        validation[0] = rightItemsInRightPosition;
        validation[1] = rightItemsInWrongPosition;
        return validation;
    }
    
    public int calculateRightItemsInRightPosition(int[] guess) {
        int count = 0;
        for(int i = 0; i < code.length; i++) {
            if(code[i] == guess[i]) {
                count++;
            }
        }
        return count;
    }
    
    public int calculateRightItemsInWrongPosition(int[] guess, int rightItemsInRightPosition) {
        int count = 0;
        int occurrencesInCode;
        int occurrencesInGuess;
        for(int i = 1; i <= 8; i++) {
            occurrencesInCode = countOccurrences(code, i);
            occurrencesInGuess = countOccurrences(guess, i);
            count += Math.min(occurrencesInCode, occurrencesInGuess);
        }
        return count - rightItemsInRightPosition;
    }
    
    public int countOccurrences(int[] array, int value) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                count++;
            }
        }
        return count;
    }
}
