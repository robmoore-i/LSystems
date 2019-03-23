public class Main {
    public static void main(String[] args) {
        String input = "11[1[0]0]1[0]0";
        String fractalTree = new LSystem().drawFractalTree(input);
        System.out.println(fractalTree);
    }
}
