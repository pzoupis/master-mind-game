package me.pzoupis.mastermind.interfaces;

public interface IGuessScorer {
    public void setCode(int[] code);
    public int[] score(int[] guess);
}
