public class Main {
    public static void main(String[] args) {
        String input = new FractalBinaryTreeCommands(4).toString();

        String fractalTree = new LSystem().drawFractalTree(input);
        System.out.println(fractalTree);
    }
}
