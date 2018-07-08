package me.pzoupis.mastermind.domain;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CodeValidatorTest {
    
    private GuessScorer codeValidator;
    private final int[] code;
    private final int[] guess;
    private final int[] expectedValidation;
        
    public CodeValidatorTest(int[] code, int[] guess, int[] expectedValidation) {
        this.code = code;
        this.guess = guess;
        this.expectedValidation = expectedValidation;
    }
    
    @Parameters
    public static Collection codeValidationCases() {
        return Arrays.asList(new int[][][] {
            {{ 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 4, 0 }},
            {{ 1, 2, 3, 4 }, { 2, 2, 3, 3 }, { 2, 0 }},
            {{ 1, 2, 3, 1 }, { 2, 2, 3, 1 }, { 3, 0 }}
        });
    }
    
    @Before
    public void setUp() {
        codeValidator = new GuessScorer();
    }

    @Test
    public void testValidate() {
        int[] actualValidation;
        
        codeValidator.setCode(code);
        actualValidation = codeValidator.score(guess);
        
        assertArrayEquals(expectedValidation, actualValidation);
    }
}
