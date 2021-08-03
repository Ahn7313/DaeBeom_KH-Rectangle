package kh.java.inherit.shape;
/**
 * 
 * Circle 은 하나의 도형(Shape)이다.(is a 상속관계)(일반화 관계라고도 부름)
 * Circle 은 중심점(Point)를 가지고 있다.(has a 포함관계)
 * 
 *
 */
public class Circle extends Shape {
	
	private Point center;	//중심점
	private int r;			//반지름
	
	public Circle() {
		super();
	}

	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	@Override
	public void draw() {
		System.out.println("중심점이" + center + "이고,"
				+ " 반지름이 " + r + " 인 원을 그린다."); 
	}

}
