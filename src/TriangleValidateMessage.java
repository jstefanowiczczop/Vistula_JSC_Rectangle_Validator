
public class TriangleValidateMessage {

	public static void main(String[] args) {

		TriangleValidator v = new TriangleValidator(0, 2, 3);
		v.setA(1);
		v.setB(3);
		v.setC(5);

		System.out.println(" Dla podanych boków trójk¹ta: " + v.getA() + "," + v.getB() + "," + v.getC()
				+ " Wynik jest: " + v.validate(v.getA(), v.getB(), v.getC()));

	}
}
