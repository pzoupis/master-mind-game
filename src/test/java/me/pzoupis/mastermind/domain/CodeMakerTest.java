package me.pzoupis.mastermind.domain;

import me.pzoupis.mastermind.models.GameConfiguration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CodeMakerTest {
    
    private CodeMaker codeMaker;
    
    public CodeMakerTest() {
    }
    
    @Before
    public void setUp() {
        codeMaker = new CodeMaker();
    }
    
    @Test
    public void testGenerateCode() {
        int expectedLength = 4;
        int[] code;
        GameConfiguration gameConfiguration = new GameConfiguration(expectedLength, 8);
        
        codeMaker.setGameConfiguration(gameConfiguration);
        code = codeMaker.generateCode();
        
        Assert.assertEquals(expectedLength, code.length);
    }
}
