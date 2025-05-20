/**
 * Unary operator
 */

package unaryoperatorclassexample;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = number -> number*number;

        System.out.println(unaryOperator.apply(5));
    }   
}
