import lsystem.FractalBinaryTree;

public class Main {
    public static void main(String[] args) {
        String fractalTree = new FractalBinaryTree().draw(4);
        System.out.println(fractalTree);
    }
}
