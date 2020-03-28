package Sudoku;
/* Created by Jorge Lopez Bauer on 3/26/2020 */
/**
 * Represents a 9x9 sudoku.
 */
public class Sudoku {

    /**
     * The cells of a 9x9 sudoku.
     */
    private SudokuCell[][] sudokuCells;

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
        this.sudokuCells = new SudokuCell[DEFAULT_SIZE][DEFAULT_SIZE];
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
     * @param number number value of the number.
     */
    public void setNumberInPosition(int i, int j, int number){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                setNumberInPosition(transformSudokuIndexToSquareIndex(i),
                transformSudokuIndexToSquareIndex(j),number);
    }

    /**
     *
     * @param index
     * @return
     */
    private int transformSudokuIndexToCellIndex(int index) {
        switch (index){
            case 0: case 3: case 6:
                return 0;
            case 1: case 4: case 7:
                return 1;
            default:
                return 2;
        }
    }

    /**
     * Transforms square indexes to numbers between 0 and 2.
     * @param index column or row index.
     * @return transformed index.
     */
    private int transformSudokuIndexToSquareIndex(int index){
        if (index < 3){
            return 0;
        } else if (index < 6){
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * Sets a clue in a position.
     * @param i column index of the array.
     * @param j row index of the array.
     * @param number number value of the number.
     */
    public void setClueInPosition(int i, int j, int number){
        setNumberInPosition(i,j,number);
        quantityOfClues++;
    }

    /**
     *Sets a pencil marking.
     * @param i column index of the array.
     * @param j row index of the array.
     * @param number number value of the number.
     */
    public void setPencilMarking(int i, int j,int number){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                setPencilMarkings(transformSudokuIndexToSquareIndex(i),
                transformSudokuIndexToSquareIndex(j),number);
    }

    /**
     * Removes a pencil marking.
     * @param i column index of the array.
     * @param j row index of the array.
     */
    public void removePencilMarking(int i, int j){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                removePencilMarkings(transformSudokuIndexToSquareIndex(i),
                transformSudokuIndexToSquareIndex(j));
    }
}
