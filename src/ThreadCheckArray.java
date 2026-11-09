public class ThreadCheckArray implements Runnable {
    private boolean flag;
    private List<Integer> winArray = new ArrayList<>();
    SharedData sd;
    ArrayList<Integer> array;
    int b;

    /**
     * Constructor for ThreadCheckArray.
     *
     * @param sd The shared data object used to synchronize between threads and store shared data.
     */
    public ThreadCheckArray(SharedData sd) {
        this.sd = sd;
        synchronized (sd) {
            array = new ArrayList<>(Arrays.asList(sd.getArray()));
            b = sd.getB();
        }
        winArray = new boolean[array.size()];
    }

    /**
     * Recursive method to check if the given value 'b' can be formed by subtracting elements from the array.
     *
     * @param n The current index in the array.
     * @param b The remaining value to form.
     */
    void rec(int n, int b) {
        synchronized (sd) {
            if (sd.getFlag()) return;
        }
        if (n == 0) {
            if (b == 0 || b == array.get(n)) {
                flag = true;
                synchronized (sd) { sd.setFlag(true); }
            }
            if (b == array.get(n)) winArray[n] = true;
            return;
        }

        rec(n-1, b - array.get(n));
        if (flag) winArray[n] = true;
        synchronized (sd) {
            if (sd.getFlag()) return;
        }
        rec(n-1, b);
    }

    /**
     * Runs the thread to check if the given value 'b' can be formed by subtracting elements from the array.
     */
    public void run() {
        if (array.size() != 1)
            if (Thread.currentThread().getName().equals("thread1"))
                rec(array.size()-1, b - array.get(array.size() - 1));
            else
                rec(array.size()-1, b);
        if (array.size() == 1)
            if (b == array.get(0) && !flag) {
                winArray[0] = true;
                flag = true;
                synchronized (sd) { sd.setFlag(true); }
            }
        if (flag) {
            if (Thread.currentThread().getName().equals("thread1"))
                winArray[array.size() - 1] = true;
            synchronized (sd) { sd.setWinArray(winArray); }
        }
    }
}
