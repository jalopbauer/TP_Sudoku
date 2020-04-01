package IdeaDeJorge;/* Created by Jorge Lopez Bauer on 4/1/2020 */

public class NineByNineSudoku extends Sudoku {

    public NineByNineSudoku() {
        super(3, 3);
    }

    int transformSudokuIndexToSquareIndex (int index) {
        switch (index){
            case 0: case 3: case 6:
                return 0;
            case 1: case 4: case 7:
                return 1;
            default:
                return 2;
        }
    }

    int transformSudokuIndexToCellIndex(int index){
        if (index < 3){
            return 0;
        } else if (index < 6){
            return 1;
        } else {
            return 2;
        }
    }

    public boolean compare(NineByNineSudoku sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku.getNumberInIndex(i,j) != getNumberInIndex(i,j)){
                    return false;
                }
            }
        }
        return true;
    }
}
