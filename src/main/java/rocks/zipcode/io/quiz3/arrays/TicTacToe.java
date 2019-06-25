package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {


        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] result = new String [3];

        for(int i = 0; i< board.length; i++){
            result[i] = board [i][value];
        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        Stream<String> toEval = Arrays.stream(getRow(rowIndex));

        if(toEval.distinct().count() == 1) return true;



        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        Stream<String> toEval = Arrays.stream(getColumn(columnIndex));

        if(toEval.distinct().count() == 1) return true;

        return false;
    }

    public String getWinner() {


        return null;
    }

    public String[][] getBoard() {


        return board;
    }
}
