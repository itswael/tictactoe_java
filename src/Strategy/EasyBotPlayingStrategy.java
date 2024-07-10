package Strategy;

import Models.*;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move decideMove(Player player, Board board) {
        for(int i=0; i<board.getSize(); i++){
            for(int j=0; j< board.getSize(); j++){
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    return new Move(player, new Cell(i,j));
                }
            }
        }
        return null;
    }
}
