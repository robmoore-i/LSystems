import lsystem.dragoncurve.DragonCurve;

public class Main {
    public static void main(String[] args) {
        String fractalTree = new DragonCurve().draw(10);
        System.out.println(fractalTree);
    }
}
