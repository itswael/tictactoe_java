package Controller;

import Models.Game;
import Models.GameStatus;
import Models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players){
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public Player getWinningPlayer(Game game) {
        return game.getWinningPlayer();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void setGameStatus(Game game, GameStatus gameStatus) {
        game.setGameStatus(gameStatus);
    }

    public void displayBoard(Game game) {
        game.getBoard().displayBoard();
    }
}
