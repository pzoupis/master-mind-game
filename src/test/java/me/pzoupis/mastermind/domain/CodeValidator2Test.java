package me.pzoupis.mastermind.domain;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CodeValidator2Test {
    
    private GuessScorer codeValidator;
        
    public CodeValidator2Test() {
        
    }
        
    @Before
    public void setUp() {
        codeValidator = new GuessScorer();
    }

    @Test
    @Parameters(source = TestCaseProvider.class, method = "provideCodeValidationCases")
    public void testValidate(int[] code, int[] guess, int[] expectedValidation) {
        int[] actualValidation;
        
        codeValidator.setCode(code);
        actualValidation = codeValidator.score(guess);
        
        assertArrayEquals(expectedValidation, actualValidation);
    }
}
