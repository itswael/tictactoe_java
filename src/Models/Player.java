package Models;

public class Player {
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player(char c, String botName, PlayerType type) {
        this.symbol = c;
        this.name = botName;
        this.playerType = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
