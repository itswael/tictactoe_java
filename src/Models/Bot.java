package Models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Bot(char c, String botName, BotDifficultyLevel botDifficultyLevel) {
        super(c, botName, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
