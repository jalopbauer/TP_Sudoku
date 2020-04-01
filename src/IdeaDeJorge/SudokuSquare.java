package IdeaDeJorge;
/* Created by Jorge Lopez Bauer on 3/26/2020 */
/**
 * Represents a single number in a 3x3 sudoku.
 */
public class SudokuSquare {

    private int number;
    private final int EMPTY_NUMBER_VALUE = 0;

    /**
     * Creates a new SudokuSquare.
     * Sets the size of the pencilMarkings to the DEFAULT_SIZE.
     */
    public SudokuSquare() {
        number = EMPTY_NUMBER_VALUE;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isEmpty(){
        return number == 0;
    }
}
