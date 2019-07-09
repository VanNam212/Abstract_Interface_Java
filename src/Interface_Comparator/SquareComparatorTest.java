package Interface_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(2);
        squares[1] = new Square(1);
        squares[2] = new Square(3);
        System.out.println("Pre-sorted:");
        for (Square square: squares) {
            System.out.println(square);
        }
        Comparator comparator = new SquareComparator();
        Arrays.sort(squares,comparator);
        System.out.println("After-sorted:");
        for (Square circle : squares) {
            System.out.println(circle);
        }
    }
}
