package EsEste;/* Created by Jorge Lopez Bauer on 4/1/2020 */

public class Sudoku {

    private int[][] sudoku;
    private int columnLength, rowLength, cellColumnLength, cellRowLength;

    private final int EMPTY_SQUARE_VALUE = 0;

    public Sudoku(int columnLength, int rowLength, int cellColumnLength, int cellRowLength) {
        this.columnLength = columnLength;
        this.rowLength = rowLength;
        this.cellColumnLength = cellColumnLength;
        this.cellRowLength = cellRowLength;
        sudoku = new int[columnLength][rowLength];
        for (int columnIndex = 0; columnIndex < columnLength; columnIndex++) {
            for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
                sudoku[columnIndex][rowIndex] = 0;
            }
        }
    }

    private void setNumberInIndex(int columnIndex, int rowIndex, int number){
        sudoku[columnIndex][rowIndex] = number;
    }

    public void setClueInPosition(int columnIndex, int rowIndex, int number){
        setNumberInIndex(columnIndex,rowIndex,number);
    }

    private void removeNumberInIndex(int columnIndex, int rowIndex){
        sudoku[columnIndex][rowIndex] = EMPTY_SQUARE_VALUE;
    }

    private boolean isNumberInRow(int rowIndex, int number){
        for (int columnIndex = 0; columnIndex < columnLength; columnIndex++) {
            if (number == sudoku[columnIndex][rowIndex]){
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInColumn(int columnIndex, int number){
        for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
            if (number == sudoku[rowIndex][columnIndex]){
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInCell(int columnIndex, int rowIndex, int number ) {
        int cellColumnStartingPoint = (columnIndex%cellColumnLength)*cellColumnLength;
        int cellRowStartingPoint = (rowIndex%cellRowLength)*cellRowLength;

        for (int cellColumnIndex = 0; cellColumnIndex < cellColumnLength; cellColumnIndex++) {
            for (int cellRowIndex = 0; cellRowIndex < cellRowLength; cellRowIndex++) {
                if (sudoku[cellColumnStartingPoint + cellColumnIndex]
                          [cellRowStartingPoint + rowIndex] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isNumberPossible(int columnIndex, int rowIndex, int number){
        return !(isNumberInCell(columnIndex,rowIndex,number) ||
                isNumberInColumn(columnIndex, number)) ||
                isNumberInRow(rowIndex,number);
    }

    public void solveSudoku(){
        for (int columnIndex = 0; columnIndex < columnLength; columnIndex++) {
            for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
                if (sudoku[columnIndex][rowIndex] == 0) {
                    for (int number = 1; number <= cellColumnLength * cellRowLength; number++) {
                        if (isNumberPossible(columnIndex,rowIndex,number)) {
                            setNumberInIndex(columnIndex,rowIndex,number);
                            solveSudoku();
                            removeNumberInIndex(columnIndex,rowIndex);
                        }
                    }
                    return;
                }
            }
        }
    }


    public boolean equals(Sudoku sudoku) {
        for (int columnIndex = 0; columnIndex < columnLength; columnIndex++) {
            for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
                if (this.getSudoku()[columnIndex][rowIndex] != this.getSudoku()[columnIndex][rowIndex]){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] getSudoku() {
        return sudoku;
    }
}
