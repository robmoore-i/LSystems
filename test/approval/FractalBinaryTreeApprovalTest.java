package approval;

import lsystem.fractalbinarytree.FractalBinaryTree;

public class FractalBinaryTreeApprovalTest extends LSystemTextOutputApprovalTest {
    @Override
    String approvalFileUri() {
        return "testfiles/fractalBinaryTree5Recursions.txt";
    }

    @Override
    String createOutput() {
        return new FractalBinaryTree().draw(5);
    }

    @Override
    boolean createNewApproval() {
        return false;
    }
}
