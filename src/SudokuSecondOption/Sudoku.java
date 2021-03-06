package SudokuSecondOption;/* Created by Jorge Lopez Bauer on 3/28/2020 */

import java.util.ArrayList;

public class Sudoku {

    SudokuSquare[][] sudokuSquares;
    int quantityOfClues;

    private final int DEFAULT_SIZE = 9;
    private final int EMPTY_SQUARE_VALUE = 0;


    /**
     * Initializes sudokuCells to the DEFAULT_SIZE.
     * Sets quantityOfClues to 0.
     */
    public Sudoku() {
        this.sudokuSquares = new SudokuSquare[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {
                sudokuSquares[i][j].setNumber(EMPTY_SQUARE_VALUE);
            }
        }
        this.quantityOfClues = 0;
    }

    /**
     * Sets number in a position.
     * @param i column index of the array.
     * @param j j row index of the array.
     * @param number value of the sudokuSquare.
     */
    public void setNumberInPosition(int i, int j, int number){
        sudokuSquares[i][j].setNumber(number);
    }


    /**
     *Sets a pencil marking.
     * @param i column index of the array.
     * @param j row index of the array.
     * @param number value of the number.
     */
    public void setPencilMarking(int i, int j,int number){
        sudokuSquares[i][j].setPencilMarkings(number);
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

    /**
     * Removes a pencil marking.
     * @param i column index of the array.
     * @param j row index of the array.
     */
    public void removePencilMarkings(int i, int j){
        sudokuSquares[i][j].removePencilMarkings();
    }

    public ArrayList<Integer> checkColumn(int column) {
        ArrayList<Integer> numbersInColumn = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            if(sudokuSquares[column][i].getNumber() != 0) {
                numbersInColumn.add(sudokuSquares[column][i].getNumber());
            }
        }
        return numbersInColumn;
    }

    public ArrayList<Integer> checkRow(int row) {
        ArrayList<Integer> numbersInColumn = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            if(sudokuSquares[i][row].getNumber() != 0) {
                numbersInColumn.add(sudokuSquares[i][row].getNumber());
            }
        }
        return numbersInColumn;
    }

   //public ArrayList<Integer> checkCell(int )

}