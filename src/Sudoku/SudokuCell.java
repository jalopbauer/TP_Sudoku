package Sudoku;

/* Created by Jorge Lopez Bauer on 3/26/2020 */
/**
 * Represents a single cell 3x3 in a 9x9 sudoku.
 */
public class SudokuCell {

    private SudokuSquare[][] sudokuSquares;

    private final int DEFAULT_SIZE = 3;

    /**
     * Creates a 3x3 SudokuCell
     * Sets the size of the sudokuSquares to the DEFAULT_SIZE.
     * Creates a SudokuSquare in each index of sudokuSquares.
     */
    public SudokuCell() {
        this.sudokuSquares = new SudokuSquare[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {
                sudokuSquares[i][j] = new SudokuSquare();
            }
        }
    }

    public void setNumberInPosition(int i, int j, int number){
        sudokuSquares[i][j].setNumber(number);
    }

    public void setPencilMarkings(int i, int j,int number){
        sudokuSquares[i][j].setPencilMarkings(number);
    }

    public void removePencilMarkings(int i, int j){
        sudokuSquares[i][j].removePencilMarkings();
    }

    public boolean isNumberInCell(int number){
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {
                if (sudokuSquares[i][j].getNumber() == number){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isNumberInRow(int j, int number){
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            if (sudokuSquares[i][j].getNumber() == number){
                return true;
            }
        }
        return false;
    }

    public boolean isNumberInColumn(int i, int number){
        for (int j = 0; j < DEFAULT_SIZE; j++) {
            if (sudokuSquares[i][j].getNumber() == number){
                return true;
            }
        }
        return false;
    }

    public int getNumberInIndex9(int i, int j){
        return sudokuSquares[i][j].getNumber();
    }
}
