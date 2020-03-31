package Sudoku;
/* Created by Jorge Lopez Bauer on 3/26/2020 */
/**
 * Represents a single number in a 3x3 sudoku.
 */
public class SudokuSquare {

    private int number;
    private int[] pencilMarkings;

    private final int DEFAULT_SIZE = 9;
    private final int EMPTY_PENCIL_MARKING_VALUE = 0;

    /**
     * Creates a new SudokuSquare.
     * Sets the size of the pencilMarkings to the DEFAULT_SIZE.
     */
    public SudokuSquare() {
        pencilMarkings = new int[DEFAULT_SIZE];
        initializePencilMarkings();
    }

    private void initializePencilMarkings() {
        for (int i = 0; i < pencilMarkings.length; i++) {
            pencilMarkings[i] = EMPTY_PENCIL_MARKING_VALUE;
        }
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setPencilMarkings(int[] pencilMarkings){
        this.pencilMarkings = pencilMarkings;
    }

    public void removePencilMarkings(){
        initializePencilMarkings();
    }

    public int getNumber() {
        return number;
    }
}
