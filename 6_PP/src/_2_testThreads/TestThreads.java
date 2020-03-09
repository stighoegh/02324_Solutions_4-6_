package _2_testThreads;

class TestThreads{
    public static void main (String[] args){
        //declare and create threads
        PrintChar printA = new PrintChar('a',10);
        PrintChar printB = new PrintChar('b',10);
        PrintNum  print100 = new PrintNum(10);
        //start threads
        print100.start();
        printA.start();
        printB.start();
    }
}
