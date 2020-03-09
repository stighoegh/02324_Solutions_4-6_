package _2_testThreads;

//The thread class for printing number from 1 to n for a given n
class PrintNum extends Thread {
    private int lastNum;

    public PrintNum(int i) {
        lastNum = i;
    }

    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }
}
