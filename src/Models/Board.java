package Models;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cells;

    public Board(int dimension) {
        this.size = dimension;
        this.cells = new LinkedList<>();
        for(int i = 0; i<dimension; i++){
            this.cells.add(new LinkedList<>());
            for(int j=0; j<dimension; j++){
                this.cells.get(i).add(new Cell(i,j));
            }
        }
    }

    public void displayBoard() {
        for(int i=0; i<cells.size(); i++){
            for(int j=0; j<cells.size(); j++){
                if(cells.get(i).get(j).getCellState()
                        .equals(CellState.EMPTY)){
                    System.out.print("|  |");
                }else{
                    System.out.print("| " +
                            cells.get(i).get(j)
                                    .getPlayer().getSymbol() + " |");
                }
            }
            System.out.println();
        }
    }
}
