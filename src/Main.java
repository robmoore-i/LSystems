public class Main {
    public static void main(String[] args) {
        String one = "1[0]0";
        String two = "11[1[0]0]1[0]0";
        String three = "1111[11[1[0]0]1[0]0]11[1[0]0]1[0]0";
        String fractalTree = new LSystem().drawFractalTree(three);
        System.out.println(fractalTree);
    }
}
