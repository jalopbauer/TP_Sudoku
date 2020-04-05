package Final;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* Created by Jorge Lopez Bauer on 4/5/2020 */
class SudokuTest {

    @Test
    void solveSudoku() {
        Sudoku sudoku = sudoku1ToFill();
        assertTrue(sudoku.solveSudoku());
        //printSudoku(sudoku);
        assertTrue(sudoku.isEqual(sudoku1Full()));
        sudoku = sudoku2ToFill();
        assertTrue(sudoku.solveSudoku());
        printSudoku(sudoku);
        assertTrue(sudoku.isEqual(sudoku2Full()));
    }

    private void printSudoku(Sudoku sudoku) {
        int[][] array = sudoku.getSudoku();
        System.out.println("-------------------");
        for(int i = 0; i < 9; i++) {
            System.out.print("|");
            for(int j = 0; j < 9; j++) {
                System.out.print(array[j][i] + "|");
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }

    Sudoku sudoku1ToFill() {
        Sudoku sudoku = new Sudoku();
        sudoku.setNumber(0,1,6);
        sudoku.setNumber(0,2,1);
        sudoku.setNumber(0,3,8);
        sudoku.setNumber(0,8,7);
        sudoku.setNumber(1,1,8);
        sudoku.setNumber(1,2,9);
        sudoku.setNumber(1,3,2);
        sudoku.setNumber(1,5,5);
        sudoku.setNumber(1,7,4);
        sudoku.setNumber(2,4,4);
        sudoku.setNumber(2,6,9);
        sudoku.setNumber(2,8,3);
        sudoku.setNumber(3,0,2);
        sudoku.setNumber(3,3,1);
        sudoku.setNumber(3,4,6);
        sudoku.setNumber(3,6,3);
        sudoku.setNumber(4,0,6);
        sudoku.setNumber(4,1,7);
        sudoku.setNumber(4,7,5);
        sudoku.setNumber(4,8,1);
        sudoku.setNumber(5,2,4);
        sudoku.setNumber(5,4,2);
        sudoku.setNumber(5,5,3);
        sudoku.setNumber(5,8,8);
        sudoku.setNumber(6,0,7);
        sudoku.setNumber(6,2,5);
        sudoku.setNumber(6,4,9);
        sudoku.setNumber(7,1,9);
        sudoku.setNumber(7,3,4);
        sudoku.setNumber(7,5,2);
        sudoku.setNumber(7,6,7);
        sudoku.setNumber(7,7,3);
        sudoku.setNumber(8,0,1);
        sudoku.setNumber(8,5,8);
        sudoku.setNumber(8,6,4);
        sudoku.setNumber(8,7,6);
        return sudoku;
    }
    Sudoku sudoku1Full(){
        Sudoku sudoku = new Sudoku();
        sudoku.setNumber(0,0,4);
        sudoku.setNumber(0,1,6);
        sudoku.setNumber(0,2,1);
        sudoku.setNumber(0,3,8);
        sudoku.setNumber(0,4,3);
        sudoku.setNumber(0,5,9);
        sudoku.setNumber(0,6,5);
        sudoku.setNumber(0,7,2);
        sudoku.setNumber(0,8,7);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(1,0,3);
        sudoku.setNumber(1,1,8);
        sudoku.setNumber(1,2,9);
        sudoku.setNumber(1,3,2);
        sudoku.setNumber(1,4,7);
        sudoku.setNumber(1,5,5);
        sudoku.setNumber(1,6,1);
        sudoku.setNumber(1,7,4);
        sudoku.setNumber(1,8,6);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(2,0,5);
        sudoku.setNumber(2,1,2);
        sudoku.setNumber(2,2,7);
        sudoku.setNumber(2,3,6);
        sudoku.setNumber(2,4,4);
        sudoku.setNumber(2,5,1);
        sudoku.setNumber(2,6,9);
        sudoku.setNumber(2,7,8);
        sudoku.setNumber(2,8,3);

        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(3,0,2);
        sudoku.setNumber(3,1,5);
        sudoku.setNumber(3,2,8);
        sudoku.setNumber(3,3,1);
        sudoku.setNumber(3,4,6);
        sudoku.setNumber(3,5,7);
        sudoku.setNumber(3,6,3);
        sudoku.setNumber(3,7,9);
        sudoku.setNumber(3,8,4);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(4,0,6);
        sudoku.setNumber(4,1,7);
        sudoku.setNumber(4,2,3);
        sudoku.setNumber(4,3,9);
        sudoku.setNumber(4,4,8);
        sudoku.setNumber(4,5,4);
        sudoku.setNumber(4,6,2);
        sudoku.setNumber(4,7,5);
        sudoku.setNumber(4,8,1);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(5,0,9);
        sudoku.setNumber(5,1,1);
        sudoku.setNumber(5,2,4);
        sudoku.setNumber(5,3,5);
        sudoku.setNumber(5,4,2);
        sudoku.setNumber(5,5,3);
        sudoku.setNumber(5,6,6);
        sudoku.setNumber(5,7,7);
        sudoku.setNumber(5,8,8);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(6,0,7);
        sudoku.setNumber(6,1,4);
        sudoku.setNumber(6,2,5);
        sudoku.setNumber(6,3,3);
        sudoku.setNumber(6,4,9);
        sudoku.setNumber(6,5,6);
        sudoku.setNumber(6,6,8);
        sudoku.setNumber(6,7,1);
        sudoku.setNumber(6,8,2);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(7,0,8);
        sudoku.setNumber(7,1,9);
        sudoku.setNumber(7,2,6);
        sudoku.setNumber(7,3,4);
        sudoku.setNumber(7,4,1);
        sudoku.setNumber(7,5,2);
        sudoku.setNumber(7,6,7);
        sudoku.setNumber(7,7,3);
        sudoku.setNumber(7,8,5);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(8,0,1);
        sudoku.setNumber(8,1,3);
        sudoku.setNumber(8,2,2);
        sudoku.setNumber(8,3,7);
        sudoku.setNumber(8,4,5);
        sudoku.setNumber(8,5,8);
        sudoku.setNumber(8,6,4);
        sudoku.setNumber(8,7,6);
        sudoku.setNumber(8,8,9);
        return sudoku;
    }
    Sudoku sudoku2ToFill() {
        Sudoku sudoku = new Sudoku();
        sudoku.setNumber(0,5,6);
        sudoku.setNumber(0,7,5);

        sudoku.setNumber(1,0,2);
        sudoku.setNumber(1,2,7);
        sudoku.setNumber(1,4,8);

        sudoku.setNumber(2,2,4);

        sudoku.setNumber(3,1,6);
        sudoku.setNumber(3,5,5);

        sudoku.setNumber(4,2,8);
        sudoku.setNumber(4,4,4);
        sudoku.setNumber(4,6,1);

        sudoku.setNumber(5,3,3);
        sudoku.setNumber(5,7,9);

        sudoku.setNumber(6,6,7);

        sudoku.setNumber(7,4,1);
        sudoku.setNumber(7,6,8);
        sudoku.setNumber(7,8,4);

        sudoku.setNumber(8,1,3);
        sudoku.setNumber(8,3,2);
        return sudoku;
    }
    Sudoku sudoku2Full(){
        Sudoku sudoku = new Sudoku();
        sudoku.setNumber(0,0,1);
        sudoku.setNumber(0,1,8);
        sudoku.setNumber(0,2,3);
        sudoku.setNumber(0,3,4);
        sudoku.setNumber(0,4,9);
        sudoku.setNumber(0,5,6);
        sudoku.setNumber(0,6,2);
        sudoku.setNumber(0,7,5);
        sudoku.setNumber(0,8,7);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(1,0,2);
        sudoku.setNumber(1,1,9);
        sudoku.setNumber(1,2,7);
        sudoku.setNumber(1,3,5);
        sudoku.setNumber(1,4,8);
        sudoku.setNumber(1,5,1);
        sudoku.setNumber(1,6,6);
        sudoku.setNumber(1,7,4);
        sudoku.setNumber(1,8,3);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(2,0,6);
        sudoku.setNumber(2,1,5);
        sudoku.setNumber(2,2,4);
        sudoku.setNumber(2,3,7);
        sudoku.setNumber(2,4,3);
        sudoku.setNumber(2,5,2);
        sudoku.setNumber(2,6,9);
        sudoku.setNumber(2,7,8);
        sudoku.setNumber(2,8,1);

        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(3,0,4);
        sudoku.setNumber(3,1,6);
        sudoku.setNumber(3,2,9);
        sudoku.setNumber(3,3,1);
        sudoku.setNumber(3,4,2);
        sudoku.setNumber(3,5,5);
        sudoku.setNumber(3,6,3);
        sudoku.setNumber(3,7,7);
        sudoku.setNumber(3,8,8);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(4,0,3);
        sudoku.setNumber(4,1,2);
        sudoku.setNumber(4,2,8);
        sudoku.setNumber(4,3,9);
        sudoku.setNumber(4,4,4);
        sudoku.setNumber(4,5,7);
        sudoku.setNumber(4,6,1);
        sudoku.setNumber(4,7,6);
        sudoku.setNumber(4,8,5);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(5,0,7);
        sudoku.setNumber(5,1,1);
        sudoku.setNumber(5,2,5);
        sudoku.setNumber(5,3,3);
        sudoku.setNumber(5,4,6);
        sudoku.setNumber(5,5,8);
        sudoku.setNumber(5,6,4);
        sudoku.setNumber(5,7,9);
        sudoku.setNumber(5,8,2);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(6,0,9);
        sudoku.setNumber(6,1,4);
        sudoku.setNumber(6,2,1);
        sudoku.setNumber(6,3,8);
        sudoku.setNumber(6,4,5);
        sudoku.setNumber(6,5,3);
        sudoku.setNumber(6,6,7);
        sudoku.setNumber(6,7,2);
        sudoku.setNumber(6,8,6);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(7,0,5);
        sudoku.setNumber(7,1,7);
        sudoku.setNumber(7,2,2);
        sudoku.setNumber(7,3,6);
        sudoku.setNumber(7,4,1);
        sudoku.setNumber(7,5,9);
        sudoku.setNumber(7,6,8);
        sudoku.setNumber(7,7,3);
        sudoku.setNumber(7,8,4);
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        //-------------------------------------
        sudoku.setNumber(8,0,8);
        sudoku.setNumber(8,1,3);
        sudoku.setNumber(8,2,6);
        sudoku.setNumber(8,3,2);
        sudoku.setNumber(8,4,7);
        sudoku.setNumber(8,5,4);
        sudoku.setNumber(8,6,5);
        sudoku.setNumber(8,7,1);
        sudoku.setNumber(8,8,9);
        return sudoku;
    }
}