package oldbox_newbox;

import org.jetbrains.annotations.Contract;

public class Box<E> {
    E data;


    public Box(E data) {
        this.data = data;
    }
    public E getData() {
        return data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
