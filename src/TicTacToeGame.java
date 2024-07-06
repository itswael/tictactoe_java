import Controller.GameController;
import Models.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Hello world!welcome to tictactoe");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimension");
        int dimension = scanner.nextInt();

        System.out.println("Enter no. of players");
        int noOfPlayers = scanner.nextInt();

        List<Player> players = new LinkedList<>();

        System.out.println("will there be any bot? y/n");
        String isBot = scanner.next();

        if(isBot.equals("y")){
            noOfPlayers--;

            System.out.println("Enter the name of Bot");
            String botName = scanner.next();

            System.out.println("Enter the Symbol of Bot");
            String botSymbol =  scanner.next();

            System.out.println("Enter Bot difficulty level");
            int difficultyLevel = scanner.nextInt();

            players.add(new Bot(botSymbol.charAt(0), botName, BotDifficultyLevel.EASY));
        }

        for(int i = 0; i<noOfPlayers; i++){
            System.out.println("Enter the name of Player: "+ i+1);
            String name = scanner.next();

            System.out.println("Enter the Symbol of Player: "+ i+1);
            String symbol =  scanner.next();

            players.add(new Player(symbol.charAt(0), name, PlayerType.HUMAN));
        }

        GameController gameController = new GameController();
        Game game = gameController.createGame(dimension, players);
        while(gameController.getGameStatus(game) == GameStatus.IN_PROGRESS){

        }

        if(gameController.getGameStatus(game) == GameStatus.DRAW){
            System.out.println(" Its a Draw");
        }else{
            System.out.println("Winner is : " + gameController.getWinningPlayer(game));
        }

    }
}