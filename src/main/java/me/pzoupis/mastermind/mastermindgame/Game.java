package me.pzoupis.mastermind.mastermindgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.pzoupis.mastermind.domain.CodeMaker;
import me.pzoupis.mastermind.domain.CodeValidator;

public class Game {
    private CodeMaker codeMaker;
    private CodeValidator codeValidator;
    private BufferedReader input;
    private int[] code;
    private int[] availableCodeItems;
    private int retries;
    
    private int MAX_RETRIES = 10;
    
    public Game() {
        codeMaker = new CodeMaker();
        codeValidator = new CodeValidator();
        input = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void playGame() {
        initializeGame();
        int[] guess;
        int[] validation;
        do {
             guess = getGuess();
             validation = codeValidator.validate(guess);
             if(validation[0] == 4) {
                 break;
             } else {
                 System.out.println("RCRP: " + validation[0] + "RCWP: " + validation[1]);
             }
        } while(true);
        System.out.println("You won!");
    }
    
    public void initializeGame() {
        setCode();
        setAvailableCodeItems();
    }
    
    public void setCode() {
        code = codeMaker.generateCode();
        codeValidator.setCode(code);
    }
    
    public void setAvailableCodeItems() {
        availableCodeItems = new int[] { 1, 2, 3, 4, 5, 6 };
    }
    
    public int[] getGuess() {
        System.out.print("Give your guess: ");
        int[] array = null;
        try {
            array = Arrays.stream(input.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }
}
