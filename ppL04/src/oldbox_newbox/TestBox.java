package oldbox_newbox;

public class TestBox {
    public static void main(String[] args) {
        Box<String> strBox = new Box<String>("Hi");
        // ingen cast
        String s = strBox.getData();

        Box<Integer> intBox = new Box<Integer>(42);
        //ingen cast
        int x = intBox.getData();
        System.out.println(intBox);
        System.out.println(strBox.toString());
        //Cannot cast from Integer to String
        // String t = (String) intBox.getData();

        //Cannot cast from  String to Integer
        //int y = (Integer) strBox.getData();

        //Type mismatch: Cannot convert from Box<String> to Box<Integer>
        //intBox = strBox;

    }


}
