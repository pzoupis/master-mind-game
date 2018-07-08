package me.pzoupis.mastermind.domain;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CodeValidatorTest1 {
    
    private CodeValidator codeValidator;
        
    public CodeValidatorTest1() {
        
    }
        
    @Before
    public void setUp() {
        codeValidator = new CodeValidator();
    }

    @Test
    @Parameters(source = TestCaseProvider.class, method = "provideCodeValidationCases")
    public void testValidate(int[] code, int[] guess, int[] expectedValidation) {
        int[] actualValidation;
        
        codeValidator.setCode(code);
        actualValidation = codeValidator.validate(guess);
        
        assertArrayEquals(expectedValidation, actualValidation);
    }
}
