package Final;

public class Sudoku {

    private int[][] sudoku = new int[9][9];

    public Sudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                setNumber(i, j, 0);
            }
        }
    }

    boolean isNumberPossible(int columnPosition, int rowPosition, int number){
        for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
            if(sudoku[columnPosition][rowIndex] == number){
                return false;
            }
        }
        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
            if (sudoku[columnIndex][rowPosition] == number){
                return false;
            }
        }
        int cellRowStartingPosition = rowPosition/3;
        cellRowStartingPosition *= 3;
        int cellColumnStartingPoint = columnPosition/3;
        cellColumnStartingPoint *= 3;
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
                if (sudoku[cellColumnStartingPoint+columnIndex][cellRowStartingPosition+rowIndex] == number){
                    return false;
                }
            }
        }
        return true;
    }

    boolean solveSudoku(){
        for (int columnIndex = 0; columnIndex < 9; columnIndex++) {
            for (int rowIndex = 0; rowIndex < 9; rowIndex++) {
                if (sudoku[columnIndex][rowIndex] == 0){
                    for (int number = 1; number <= 9; number++) {
                        if (isNumberPossible(columnIndex,rowIndex,number)){
                            setNumber(columnIndex, rowIndex, number);
                            if (solveSudoku()){
                                return true;
                            } else {
                                setNumber(columnIndex, rowIndex, 0);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    void setNumber(int columnIndex, int rowIndex, int number) {
        sudoku[columnIndex][rowIndex] = number;
    }

    public boolean isEqual(Sudoku sudoku1Full) {
        for (int columnLength = 0; columnLength < 9; columnLength++) {
            for (int rowLength = 0; rowLength < 9; rowLength++) {
                if (this.getSudoku()[columnLength][rowLength] != sudoku1Full.getSudoku()[columnLength][rowLength]){
                    return false;
                }
            }

        }
        return true;
    }

    int[][] getSudoku() {
        return sudoku;
    }
}
