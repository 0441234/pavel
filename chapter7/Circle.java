package day7;

public class Circle {
	double r ;
	Circle(double r){
		this.r=r;
	}
	double pi =3.1492;
	double CircleArea() {
		return Math.round(r*r*pi);
		
	}


}
