package me.pzoupis.mastermind.mastermindgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.pzoupis.mastermind.domain.CodeMaker;
import me.pzoupis.mastermind.domain.GuessScorer;
import me.pzoupis.mastermind.interfaces.ICodeMaker;
import me.pzoupis.mastermind.interfaces.IGame;
import me.pzoupis.mastermind.interfaces.IGuessScorer;
import me.pzoupis.mastermind.models.GameConfiguration;

public class Game implements IGame {
    private ICodeMaker codeMaker;
    private IGuessScorer codeValidator;
    private BufferedReader input;
    private int[] code;
    private int retries;
    
    private int MAX_RETRIES = 10;
    
    public Game() {
        codeMaker = new CodeMaker();
        codeValidator = new GuessScorer();
        input = new BufferedReader(new InputStreamReader(System.in));
    }
    
    @Override
    public void playGame() {
        initializeGame();
        int[] guess;
        int[] validation;
        
        do {
             guess = getGuess();
             validation = codeValidator.score(guess);
             if(validation[0] == 4) {
                 break;
             } else {
                 System.out.println("RCRP: " + validation[0] + "\tRCWP: " + validation[1]);
             }
        } while(true);
        System.out.println("You won!");
    }
    
    public void initializeGame() {
        GameConfiguration gameConfiguration = new GameConfiguration(4, 8, true);
        codeMaker.setGameConfiguration(gameConfiguration);
        setCode();
    }
    
    public void setCode() {
        code = codeMaker.generateCode();
        codeValidator.setCode(code);
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
