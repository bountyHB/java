package 시험.com.kh.test.shape.model;

public class Circle {
	public static final double PI = 3.14;
	private double radius; // private으로 수정하기.
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static double getPi() {
		return PI;
	}

	public void draw () {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}
	


}
