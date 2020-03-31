package Sudoku;
/* Created by Jorge Lopez Bauer on 3/26/2020 */

/**
 * Represents a 9x9 sudoku.
 */
public class Sudoku {

    private SudokuCell[][] sudokuCells;
    int quantityOfClues;

    private final int DEFAULT_SIZE = 3;

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

    public void setNumberInPosition(int i, int j, int number){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                setNumberInPosition(transformSudokuIndexToSquareIndex(i),
                transformSudokuIndexToSquareIndex(j),number);
    }

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

    private int transformSudokuIndexToSquareIndex(int index){
        if (index < 3){
            return 0;
        } else if (index < 6){
            return 1;
        } else {
            return 2;
        }
    }

    public void setClueInPosition(int i, int j, int number){
        setNumberInPosition(i,j,number);
        quantityOfClues++;
    }

    public void setPencilMarking(int i, int j, int number){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                setPencilMarkings(transformSudokuIndexToSquareIndex(i),
                transformSudokuIndexToSquareIndex(j),number);
    }

    public void removePencilMarking(int i, int j){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                removePencilMarkings(transformSudokuIndexToSquareIndex(i),
                transformSudokuIndexToSquareIndex(j));
    }

    public boolean isNumberInCell(int i, int j, int number){
        return sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                isNumberInCell(number);
    }

    public boolean isNumberInRow(int j, int number){
        return  sudokuCells[0][transformSudokuIndexToCellIndex(j)].
                        isNumberInRow(transformSudokuIndexToSquareIndex(j),number) ||
                sudokuCells[1][transformSudokuIndexToCellIndex(j)].
                        isNumberInRow(transformSudokuIndexToSquareIndex(j),number) ||
                sudokuCells[2][transformSudokuIndexToCellIndex(j)].
                        isNumberInRow(transformSudokuIndexToSquareIndex(j),number);
    }

    public boolean isNumberInColumn(int i, int number){
        return  sudokuCells[transformSudokuIndexToCellIndex(i)][0].
                isNumberInColumn(transformSudokuIndexToSquareIndex(i),number) ||
                sudokuCells[transformSudokuIndexToCellIndex(i)][1].
                        isNumberInColumn(transformSudokuIndexToSquareIndex(i),number) ||
                sudokuCells[transformSudokuIndexToCellIndex(i)][2].
                        isNumberInColumn(transformSudokuIndexToSquareIndex(i),number);
    }

    public int getNumberInIndex(int i, int j){
        return sudokuCells[transformSudokuIndexToCellIndex(i)]
                [transformSudokuIndexToCellIndex(j)].
                getNumberInIndex(transformSudokuIndexToCellIndex(i),
                        transformSudokuIndexToCellIndex(j));
    }

    public int[] createPencilMarkings(int column, int row) {
        int[] numbersForPencilMarking = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 1; i < 10; i++) {
            if(isNumberInCell(column, row, i) || isNumberInColumn(column, i) || isNumberInRow(row, i))
                numbersForPencilMarking[i] = 0;
        }
        return numbersForPencilMarking;
    }

}
