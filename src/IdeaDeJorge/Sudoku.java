package IdeaDeJorge;
/* Created by Jorge Lopez Bauer on 3/26/2020 */

import java.util.ArrayList;

/**
 * Represents a sudoku.
 */
public abstract class Sudoku {

    private SudokuCell[][] sudokuCells;
    private int amountOfSetNumbers;
    private int rowSize, columnSize;

    public Sudoku(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.sudokuCells = new SudokuCell[columnSize][rowSize];
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                sudokuCells[i][j] = new SudokuCell(columnSize, rowSize);
            }
        }
        this.amountOfSetNumbers = 0;
    }


    /**
     * Analizer Methods.
     */


    public boolean isNumberInCell(int i, int j, int number){
        return sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                isNumberInCell(number);
    }

    public boolean isNumberInRow(int j, int number){
        for (int i = 0; i < columnSize; i++) {
            if (sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                    isNumberInRow(transformSudokuIndexToSquareIndex(j),number)){
                return true;
            }
        }
        return false;
    }

    public boolean isNumberInColumn(int j, int number){
        for (int i = 0; i < rowSize; i++) {
            if (sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                    isNumberInColumn(transformSudokuIndexToSquareIndex(j),number)){
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInColumnOrRow(int i, int j, int number){
        return isNumberInColumn(i,number) || isNumberInRow(j,number);
    }



    public boolean isSquareEmptyInIndex(int i, int j) {
        return sudokuCells[transformSudokuIndexToCellIndex(i)]
                [transformSudokuIndexToCellIndex(j)].
                isSquareEmptyInIndex(transformSudokuIndexToSquareIndex(i),
                        transformSudokuIndexToSquareIndex(j));
    }

    private boolean isPossibleNumberUnique(ArrayList<Integer> possibleNumbers) {
        return possibleNumbers.size() == 1;
    }

    private boolean isNumberPossibleInIndex(int i, int j, int possibleNumber) {
        return isNumberInColumnOrRow(transformSudokuIndexToCellIndex(i),
                transformSudokuIndexToCellIndex(j),possibleNumber);
    }

    /**
     * Transformer Methods.
     */

    abstract int transformSudokuIndexToSquareIndex (int index);


    abstract int transformSudokuIndexToCellIndex(int index);

    public void removeNumberInIndex(int i, int j, int number){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                removeNumberInIndex(transformSudokuIndexToSquareIndex(i),
                        transformSudokuIndexToSquareIndex(j),number);
        amountOfSetNumbers--;
    }

    /**
     * Modifier Methods
     */


    public void solveSudoku(){
        //correctSolve();
        possibleSolve();

    }

    private void possibleSolve() {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (isSquareEmptyInIndex(i,j)){
                        for (int number = 1; number < 10; number++) {
                            if (isNumberInColumnOrRow(i,j,number)){
                                setNumberInPosition(i,j,number);
                                System.out.println(number);
                                System.out.println();
                                possibleSolve();

                                removeNumberInIndex(i,j,number);
                            }
                        }
                        return;
                    }
                }
            }
    }


    private void correctSolve() {
        int numbersSet;
        do {
            numbersSet = 0;
            for (int i = 0; i < columnSize; i++) {
                for (int j = 0; j < rowSize; j++) {
                    ArrayList<Integer> possibleNumbers = getPossibleNumbers(i,j);
                    if (isSquareEmptyInIndex(i, j) && isPossibleNumberUnique(possibleNumbers)) {
                        System.out.println(getPossibleNumber(possibleNumbers));
                        setNumberInPosition(i, j, getPossibleNumber(possibleNumbers));
                        numbersSet++;
                    }
                }
            }
        } while (amountOfSetNumbers < columnSize * rowSize && numbersSet != 0);



    }

    /**
     * Setters.
     */


    public void setNumberInPosition(int i, int j, int number){
        sudokuCells[transformSudokuIndexToCellIndex(i)][transformSudokuIndexToCellIndex(j)].
                setNumberInPosition(transformSudokuIndexToSquareIndex(i),
                        transformSudokuIndexToSquareIndex(j),number);
        amountOfSetNumbers++;
    }

    public void setClueInPosition(int i, int j, int number){
        setNumberInPosition(i,j,number);
    }

    /**
     * Getters.
     */

    private int getPossibleNumber(int i, int j) {
        return getPossibleNumbers(i,j).get(0);
    }

    private int getPossibleNumber(ArrayList<Integer> possibleNumbers) {
        return possibleNumbers.get(0);
    }

    private ArrayList<Integer> getPossibleNumbers(int i, int j) {
        ArrayList<Integer> possibleNumbers= sudokuCells[transformSudokuIndexToCellIndex(i)]
                [transformSudokuIndexToCellIndex(j)].getPossibleNumbers();
        /*for (Integer possibleNumber : possibleNumbers) {
            if (!isNumberPossibleInIndex(i,j,possibleNumber)) {
                possibleNumbers.remove(possibleNumber);
            }
        }*/

        for (int k = 0; k < possibleNumbers.size(); k++) {
            if (!isNumberPossibleInIndex(i,j,possibleNumbers.get(k))) {
                int possibleNumber = possibleNumbers.get(k);
                possibleNumbers.remove((Integer) possibleNumber);
            }
        }
        return possibleNumbers;
    }



    public int getNumberInIndex(int i, int j){
        return sudokuCells[transformSudokuIndexToCellIndex(i)]
                [transformSudokuIndexToCellIndex(j)].
                getNumberInIndex(transformSudokuIndexToSquareIndex(i),
                        transformSudokuIndexToSquareIndex(j));
    }


    public int getAmountOfSetNumbers() {
        return amountOfSetNumbers;
    }
}
