package SudokuSecondOption;/* Created by Jorge Lopez Bauer on 3/28/2020 */

public class Sudoku {

    SudokuSquare[][] sudokuSquares;
    int quantityOfClues;

    private final int DEFAULT_SIZE = 9;
    private final int EMPTY_SUDOKU_VALUE = 0;


    /**
     * Initializes sudokuCells to the DEFAULT_SIZE.
     * Sets quantityOfClues to 0.
     */
    public Sudoku() {
        this.sudokuSquares = new SudokuSquare[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {

            }
        }
        this.quantityOfClues = 0;
    }

    /**
     * Sets number in a position.
     * Calls method to transform indexes.
     * @param i column index of the array.
     * @param j j row index of the array.
     * @param number value of the sudokuSquare.
     */
    public void setNumberInPosition(int i, int j, int number){
        sudokuSquares[i][j].setNumber(number);
    }

    /**
     * Removes a pencil marking.
     * @param i column index of the array.
     * @param j row index of the array.
     * @param number value of pencil marking to be removed.
     */
    public void removePencilMarking(int i, int j, int number){
        sudokuSquares[i][j].removePencilMarking(number);
    }
}
