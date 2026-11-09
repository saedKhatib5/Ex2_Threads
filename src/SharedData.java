import java.util.ArrayList;

public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
        // Initialize the winArray with the size of the array
        winArray = new boolean[array.size()];
    }

    /**
     * Getter method for the ArrayList array.
     *
     * @return the ArrayList array
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Setter method for the ArrayList array.
     *
     * @param array the ArrayList array to set
     */
    public void setArray(ArrayList<Integer> array) {
        this.array = array;
        // Update the size of the winArray with the new size of the array
        winArray = new boolean[array.size()];
    }

    /**
     * Getter method for the boolean array winArray.
     *
     * @return the boolean array winArray
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Setter method for the boolean array winArray.
     *
     * @param winArray the boolean array winArray to set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Getter method for the final integer b.
     *
     * @return the final integer b
     */
    public int getB() {
        return b;
    }

    /**
     * Getter method for the boolean flag.
     *
     * @return the boolean flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Setter method for the boolean flag.
     *
     * @param flag the boolean flag to set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
