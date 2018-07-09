package me.pzoupis.mastermind.interfaces;

import me.pzoupis.mastermind.models.GameConfiguration;

public interface ICodeMaker {
    public int[] generateCode();
    public void setGameConfiguration(GameConfiguration gameConfiguration);
}
