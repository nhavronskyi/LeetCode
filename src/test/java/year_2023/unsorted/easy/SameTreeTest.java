package year_2023.unsorted.easy;

import org.example.year_2023.july.easy.SameTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {
    private final SameTree service = new SameTree();

    //[1,2,3] [1,2,3] true
    @Test
    public void correct() {
        SameTree aTree = new SameTree();
        aTree.insert(1);
        aTree.insert(2);
        aTree.insert(3);

        SameTree bTree = new SameTree();
        bTree.insert(1);
        bTree.insert(2);
        bTree.insert(3);

        Assertions.assertTrue(service.isSameTree(aTree.getRoot(), bTree.getRoot()));
    }

    //[1,2] [1,3] false
    @Test
    public void differentFalse() {
        SameTree aTree = new SameTree();
        aTree.insert(1);
        aTree.insert(2);

        SameTree bTree = new SameTree();
        bTree.insert(1);
        bTree.insert(3);

        Assertions.assertFalse(service.isSameTree(aTree.getRoot(), bTree.getRoot()));
    }

    //[1,2,1] [1,1,2] false
    @Test
    public void differentFalse2() {
        SameTree aTree = new SameTree();
        aTree.insert(1);
        aTree.insert(2);
        aTree.insert(1);

        SameTree bTree = new SameTree();
        bTree.insert(1);
        bTree.insert(1);
        bTree.insert(2);

        Assertions.assertFalse(service.isSameTree(aTree.getRoot(), bTree.getRoot()));
    }
}
