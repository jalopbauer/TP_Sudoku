package SudokuSecondOption;/* Created by Jorge Lopez Bauer on 3/28/2020 */


/**
 * Represents a single number in a 9x9 sudoku.
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

    public void setPencilMarkings(int number){
        for (int i = 0; i < pencilMarkings.length; i++) {
            if (pencilMarkings[i] == 0){
                pencilMarkings[i] = number;
            }
        }
    }

    public void removePencilMarking(int number){
        for (int i = 0; i < pencilMarkings.length; i++) {
            if (pencilMarkings[i] == number){
                pencilMarkings[i] = EMPTY_PENCIL_MARKING_VALUE;
            }
        }
    }

    public void removePencilMarkings(){
        initializePencilMarkings();
    }

    public int getNumber() {
        return number;
    }
}
