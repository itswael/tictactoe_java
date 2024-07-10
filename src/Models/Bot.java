package Models;

import Strategy.BotPlayingStrategy;
import Strategy.EasyBotPlayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Bot(char c, String botName, BotDifficultyLevel botDifficultyLevel) {
        super(c, botName, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = new EasyBotPlayingStrategy();
    }

    public Move decideMove(Board board){
        return botPlayingStrategy.decideMove(this, board);
    }
}
