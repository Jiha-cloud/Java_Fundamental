package java_20210511;

public class ShapeDemo2 {
	public static void main(String[] args) {
		ShapeManager manager = ShapeManager.getInstance();
		Triangle t = new Triangle();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		manager.run(t);
	}
}
