package SudokuSolver;

import Sudoku.Sudoku;

import static org.junit.jupiter.api.Assertions.*;

/* Created by Jorge Lopez Bauer on 3/31/2020 */
class SudokuSolverTest {


    @org.junit.jupiter.api.Test
    void solveSudoku() {
        SudokuSolver solver = new SudokuSolver(9,9);
        assertTrue(solver.compareSudokus(solver.solveSudoku(sudoku2()),sudoku1()));
    }

    Sudoku sudoku2() {
        Sudoku sudoku = new Sudoku();
        sudoku.setClueInPosition(0,1,6);
        sudoku.setClueInPosition(0,2,1);
        sudoku.setClueInPosition(0,3,8);
        sudoku.setClueInPosition(0,8,7);
        sudoku.setClueInPosition(1,1,8);
        sudoku.setClueInPosition(1,2,9);
        sudoku.setClueInPosition(1,3,2);
        sudoku.setClueInPosition(1,5,5);
        sudoku.setClueInPosition(1,7,4);
        sudoku.setClueInPosition(2,4,4);
        sudoku.setClueInPosition(2,6,9);
        sudoku.setClueInPosition(2,8,3);
        sudoku.setClueInPosition(3,0,2);
        sudoku.setClueInPosition(3,3,1);
        sudoku.setClueInPosition(3,4,6);
        sudoku.setClueInPosition(3,6,3);
        sudoku.setClueInPosition(4,0,6);
        sudoku.setClueInPosition(4,1,7);
        sudoku.setClueInPosition(4,7,5);
        sudoku.setClueInPosition(4,8,1);
        sudoku.setClueInPosition(5,2,4);
        sudoku.setClueInPosition(5,4,2);
        sudoku.setClueInPosition(5,5,3);
        sudoku.setClueInPosition(5,8,8);
        sudoku.setClueInPosition(6,0,7);
        sudoku.setClueInPosition(6,2,5);
        sudoku.setClueInPosition(6,4,9);
        sudoku.setClueInPosition(7,1,9);
        sudoku.setClueInPosition(7,3,4);
        sudoku.setClueInPosition(7,5,2);
        sudoku.setClueInPosition(7,6,7);
        sudoku.setClueInPosition(7,7,3);
        sudoku.setClueInPosition(8,0,1);
        sudoku.setClueInPosition(8,5,8);
        sudoku.setClueInPosition(8,6,4);
        sudoku.setClueInPosition(8,7,6);

        return sudoku;
    }
    Sudoku sudoku1(){
        Sudoku sudoku = new Sudoku();
        sudoku.setClueInPosition(0,0,4);
        sudoku.setClueInPosition(0,1,6);
        sudoku.setClueInPosition(0,2,1);
        sudoku.setClueInPosition(0,3,8);
        sudoku.setClueInPosition(0,4,3);
        sudoku.setClueInPosition(0,5,9);
        sudoku.setClueInPosition(0,6,5);
        sudoku.setClueInPosition(0,7,2);
        sudoku.setClueInPosition(0,8,7);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(1,0,3);
        sudoku.setClueInPosition(1,1,8);
        sudoku.setClueInPosition(1,2,9);
        sudoku.setClueInPosition(1,3,2);
        sudoku.setClueInPosition(1,4,7);
        sudoku.setClueInPosition(1,5,5);
        sudoku.setClueInPosition(1,6,1);
        sudoku.setClueInPosition(1,7,4);
        sudoku.setClueInPosition(1,8,6);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(2,0,5);
        sudoku.setClueInPosition(2,1,2);
        sudoku.setClueInPosition(2,2,7);
        sudoku.setClueInPosition(2,3,6);
        sudoku.setClueInPosition(2,4,4);
        sudoku.setClueInPosition(2,5,1);
        sudoku.setClueInPosition(2,6,9);
        sudoku.setClueInPosition(2,7,8);
        sudoku.setClueInPosition(2,8,3);

        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(3,0,2);
        sudoku.setClueInPosition(3,1,5);
        sudoku.setClueInPosition(3,2,8);
        sudoku.setClueInPosition(3,3,1);
        sudoku.setClueInPosition(3,4,6);
        sudoku.setClueInPosition(3,5,7);
        sudoku.setClueInPosition(3,6,3);
        sudoku.setClueInPosition(3,7,9);
        sudoku.setClueInPosition(3,8,4);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(4,0,6);
        sudoku.setClueInPosition(4,1,7);
        sudoku.setClueInPosition(4,2,3);
        sudoku.setClueInPosition(4,3,9);
        sudoku.setClueInPosition(4,4,8);
        sudoku.setClueInPosition(4,5,4);
        sudoku.setClueInPosition(4,6,2);
        sudoku.setClueInPosition(4,7,5);
        sudoku.setClueInPosition(4,8,1);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(5,0,9);
        sudoku.setClueInPosition(5,1,1);
        sudoku.setClueInPosition(5,2,4);
        sudoku.setClueInPosition(5,3,5);
        sudoku.setClueInPosition(5,4,2);
        sudoku.setClueInPosition(5,5,3);
        sudoku.setClueInPosition(5,6,6);
        sudoku.setClueInPosition(5,7,7);
        sudoku.setClueInPosition(5,8,8);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(6,0,7);
        sudoku.setClueInPosition(6,1,4);
        sudoku.setClueInPosition(6,2,5);
        sudoku.setClueInPosition(6,3,3);
        sudoku.setClueInPosition(6,4,9);
        sudoku.setClueInPosition(6,5,6);
        sudoku.setClueInPosition(6,6,8);
        sudoku.setClueInPosition(6,7,1);
        sudoku.setClueInPosition(6,8,2);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(7,0,8);
        sudoku.setClueInPosition(7,1,9);
        sudoku.setClueInPosition(7,2,6);
        sudoku.setClueInPosition(7,3,4);
        sudoku.setClueInPosition(7,4,1);
        sudoku.setClueInPosition(7,5,2);
        sudoku.setClueInPosition(7,6,7);
        sudoku.setClueInPosition(7,7,3);
        sudoku.setClueInPosition(7,8,5);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setClueInPosition(8,0,1);
        sudoku.setClueInPosition(8,1,3);
        sudoku.setClueInPosition(8,2,2);
        sudoku.setClueInPosition(8,3,7);
        sudoku.setClueInPosition(8,4,5);
        sudoku.setClueInPosition(8,5,8);
        sudoku.setClueInPosition(8,6,4);
        sudoku.setClueInPosition(8,7,6);
        sudoku.setClueInPosition(8,8,9);
        return sudoku;
    }
}