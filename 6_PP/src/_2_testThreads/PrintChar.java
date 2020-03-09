package _2_testThreads;

//The thread class for printing a specified character in specified times
class PrintChar extends Thread {
    private char charToPrint;  //the character to print
    private int times;  //the times to repeat

    //The thread class constructor
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    //override the run() method to tell the system what the thread will do
    public void run() {
        for (int i = 1; i < times; i++)
            System.out.print(charToPrint);
    }
}
