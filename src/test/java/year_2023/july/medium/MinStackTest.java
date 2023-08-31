package year_2023.july.medium;

import org.example.year_2023.july.medium.MinStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class MinStackTest {
    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assertions.assertEquals(-3, minStack.getMin());

        minStack.pop();

        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }

    @Test
    public void emptyStack() {
        MinStack minStack = new MinStack();
        try {
            minStack.getMin();
        } catch (Exception e) {
            Assertions.assertEquals(EmptyStackException.class, e.getClass());
        }
    }
}
