package SudokuSecondOption;/* Created by Jorge Lopez Bauer on 3/28/2020 */

public class Sudoku {

    /**
     * The cells of a 9x9 sudoku.
     */
    SudokuSquare[][] sudokuSquares;

    /**
     * The DEFAULT_SIZE of the sudokuCells.
     */
    private final int DEFAULT_SIZE = 3;

    /**
     * The amount of clues given to solve the sudoku.
     */
    int quantityOfClues;

    /**
     * Sets the size of the sudokuSquares to the DEFAULT_SIZE.
     * Initializes sudokuCells.
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
}
