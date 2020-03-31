package SudokuSolver;
/* Created by Jorge Lopez Bauer on 3/31/2020 */

import Sudoku.Sudoku;

public class SudokuSolver {

    private int numbersInserted, columnSizeOfSudoku, rowSizeOfSudoku;

    public SudokuSolver(int columnSizeOfSudoku, int rowSizeOfSudoku) {
        this.columnSizeOfSudoku = columnSizeOfSudoku;
        this.rowSizeOfSudoku = rowSizeOfSudoku;
    }

    public Sudoku solveSudoku(Sudoku sudoku){
        numbersInserted = sudoku.getQuantityOfClues();
        while (numbersInserted < columnSizeOfSudoku * rowSizeOfSudoku){
            for (int i = 0; i < columnSizeOfSudoku; i++) {
                for (int j = 0; j < rowSizeOfSudoku; j++) {
                    if (sudoku.isEmptyInIndex(i,j)) {
                        int[] pencilMarkings = sudoku.createPencilMarkings(i, j);
                        if (amountOfPencilMarkings(pencilMarkings) == 1) {
                            int number = 0;
                            while (number == 0) {
                                int k = 0;
                                number = pencilMarkings[k];
                                k++;
                            }
                            sudoku.setNumberInPosition(i, j, number);
                            ++numbersInserted;
                        } else {
                            sudoku.setPencilMarking(i, j, sudoku.createPencilMarkings(i, j));
                        }
                    }
                }
            }
        }
        return sudoku;
    }

    private int amountOfPencilMarkings(int[] pencilMarkings) {
        int amountOfPencilMarkins = 0;
        for (int i = 0; i < pencilMarkings.length; i++) {
            if (pencilMarkings[i] != 0){
                amountOfPencilMarkins++;
            }
        }
        return amountOfPencilMarkins;
    }
}
