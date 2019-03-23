import lsystem.dragoncurve.DragonCurve;
import lsystem.fractalbinarytree.FractalBinaryTree;

public class Main {
    public static void main(String[] args) {
        System.out.println(new DragonCurve().draw(10));

        System.out.println("\n\n\n\n");

        System.out.println(new FractalBinaryTree().draw(5));
    }
}
