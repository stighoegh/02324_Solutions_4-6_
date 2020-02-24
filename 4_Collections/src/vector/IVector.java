package vector;

public interface IVector {
    double getX();
    double getY();
    String toString();
    IVector times(int i);
    IVector add(IVector v);
    boolean equals(IVector v);
}
