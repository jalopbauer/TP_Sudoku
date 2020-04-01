package IdeaDeJorge;

/* Created by Jorge Lopez Bauer on 3/26/2020 */

import java.util.ArrayList;

/**
 * Represents a single cell 3x3 in a 9x9 sudoku.
 */
public class SudokuCell {

    private SudokuSquare[][] sudokuSquares;
    private ArrayList<Integer> possibleNumbers;
    private int rowSize, columnSize;

    /**
     * Creates a 3x3 SudokuCell
     * Sets the size of the sudokuSquares to the DEFAULT_SIZE.
     * Creates a SudokuSquare in each index of sudokuSquares.
     */
    public SudokuCell(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.sudokuSquares = new SudokuSquare[columnSize][rowSize];
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                sudokuSquares[i][j] = new SudokuSquare();
            }
        }
        possibleNumbers = new ArrayList<>();
        for (int i = 1; i <= rowSize*columnSize; i++) {
            possibleNumbers.add(i);
        }
    }
    public void setNumberInPosition(int i, int j, int number){
        sudokuSquares[i][j].setNumber(number);
        possibleNumbers.remove((Integer) number);
    }

    public boolean isNumberInCell(int number){
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                if (sudokuSquares[i][j].getNumber() == number){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isNumberInRow(int j, int number){
        for (int i = 0; i < columnSize; i++) {
            if (sudokuSquares[i][j].getNumber() == number){
                return true;
            }
        }
        return false;
    }

    public boolean isNumberInColumn(int j, int number){
        for (int i = 0; i < rowSize; i++) {
            if (sudokuSquares[i][j].getNumber() == number){
                return true;
            }
        }
        return false;
    }

    public int getNumberInIndex(int i, int j){
        return sudokuSquares[i][j].getNumber();
    }

    public ArrayList<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }

    public boolean isSquareEmptyInIndex(int i, int j) {
        return sudokuSquares[i][j].isEmpty();
    }

    public void removeNumberInIndex(int i, int j, int number) {
        sudokuSquares[i][j].setNumber(0);
        possibleNumbers.add(number);
    }
}
