package SudokuSolver;

import Sudoku.Sudoku;

import static org.junit.jupiter.api.Assertions.*;

/* Created by Jorge Lopez Bauer on 3/31/2020 */
class SudokuSolverTest {

    @org.junit.jupiter.api.Test
    void solveSudoku() {
        Sudoku sudoku = new Sudoku();
        sudoku.setClueInPosition(3,0,2);
        sudoku.setClueInPosition(4,0,6);
        sudoku.setClueInPosition(6,0,7);
        sudoku.setClueInPosition(8,0,1);
        sudoku.setClueInPosition(0,1,6);
        sudoku.setClueInPosition(1,1,8);
        sudoku.setClueInPosition(4,1,7);
        sudoku.setClueInPosition(7,1,9);
        sudoku.setClueInPosition(0,2,1);
        sudoku.setClueInPosition(1,2,9);
        sudoku.setClueInPosition(5,2,4);
        sudoku.setClueInPosition(6,2,5);
        sudoku.setClueInPosition(0,3,8);
        sudoku.setClueInPosition(1,3,2);
        sudoku.setClueInPosition(3,3,1);
        sudoku.setClueInPosition(7,3,4);
        sudoku.setClueInPosition(2,4,4);
        sudoku.setClueInPosition(3,4,6);
        sudoku.setClueInPosition(5,4,2);
        sudoku.setClueInPosition(6,4,9);
        sudoku.setClueInPosition(1,5,5);
        sudoku.setClueInPosition(5,5,3);
        sudoku.setClueInPosition(7,5,2);
        sudoku.setClueInPosition(8,5,8);
        sudoku.setClueInPosition(2,6,9);
        sudoku.setClueInPosition(3,6,3);
        sudoku.setClueInPosition(7,6,7);
        sudoku.setClueInPosition(8,6,4);
        sudoku.setClueInPosition(1,7,4);
        sudoku.setClueInPosition(4,7,5);
        sudoku.setClueInPosition(7,7,3);
        sudoku.setClueInPosition(8,7,6);
        sudoku.setClueInPosition(0,8,7);
        sudoku.setClueInPosition(2,8,3);
        sudoku.setClueInPosition(4,8,1);
        sudoku.setClueInPosition(5,8,8);

        SudokuSolver solver = new SudokuSolver(9,9);
        solver.solveSudoku(sudoku);




    }
}