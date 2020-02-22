package oldbox_newbox;

public class TestOldBox {
    public static void main(String[] args) {
        OldBox intBox = new OldBox(42);
        // cast
        int x = (Integer) intBox.getData();

        OldBox strBox = new OldBox("Hi");
        // cast
        String s = (String) strBox.getData();

        //Cannot cast from String to Integer
        //int y = (Integer) strBox.getData();

        intBox = strBox;

//        System.out.println(intBox);
//        System.out.println(strBox);


    }


}
