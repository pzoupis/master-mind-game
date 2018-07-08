package me.pzoupis.mastermind.domain;

import java.util.Arrays;
import me.pzoupis.mastermind.interfaces.ICodeMaker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CodeMaker implements ICodeMaker {
    
    private static final Logger logger = LogManager.getLogger(CodeMaker.class);
    
    @Override
    public int[] generateCode() {
        int[] code = new int[4];
        for(int i = 0; i < 4; i++) {
            code[i] = getRandomDigit();
        }
        logger.debug("The generated code is: " + Arrays.toString(code));
        return code;
    }
    
    private int getRandomDigit() {
        return (int) (6 * Math.random() + 1); 
    }
}
