package day9;

class a{
	public String x() {
		return "x";
	}
}
class b extends a{
	public String y() {
		return "y";
	}
}
public class ex07 {
	public static void main(String[] args) {
		a ex = new b();
		ex.x();
		ex.y();

	}

}
