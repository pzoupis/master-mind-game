package me.pzoupis.mastermind;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import me.pzoupis.mastermind.mastermindgame.Game;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("The game begins");
        Game game = new Game();
        game.playGame();
    }
}
