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

    /**
     * Sets the number in the position.
     * @param number the value of the number.
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * Adds a pencil to the predisposed position.
     * @param number the value of the number that wants to be marked.
     */
    public void setPencilMarkings(int number){
        for (int i = 0; i < pencilMarkings.length; i++) {
            if (pencilMarkings[i] == 0){
                pencilMarkings[i] = number;
            }
        }
    }

    /**
     * Removes a pencil marking.
     * @param number pencil marking to be removed.
     */
    public void removePencilMarking(int number){
        for (int i = 0; i < pencilMarkings.length; i++) {
            if (pencilMarkings[i] == number){
                pencilMarkings[i] = EMPTY_PENCIL_MARKING_VALUE;
            }
        }
    }

    /**
     * Removes pencil markings.
     */
    public void removePencilMarkings(){
        initializePencilMarkings();
    }
}
