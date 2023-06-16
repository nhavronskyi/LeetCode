package medium;

import org.example.medium.MinStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test
    public void test(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assertions.assertEquals(-3, minStack.getMin());

        minStack.pop();

        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }
}
