import lsystem.dragoncurve.DragonCurve;
import lsystem.fractalbinarytree.FractalBinaryTree;
import lsystem.kochcurve.KochCurve;

public class Main {
    public static void main(String[] args) {
        System.out.println(new DragonCurve().draw(10));

        System.out.println("\n\n\n\n");

        System.out.println(new FractalBinaryTree().draw(5));

        System.out.println("\n\n\n\n");

        System.out.println(new KochCurve().draw(3));
    }
}
