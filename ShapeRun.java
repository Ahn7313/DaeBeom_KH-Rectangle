package kh.java.inherit.shape;

public class ShapeRun {

	public static void main(String[] args) {
		
//		Circle c1 = new Circle();
//		c1.setR(10);
//		c1.setCenter(new Point(100, 100));
//		System.out.println(c1.getR());
//		System.out.println(c1.getCenter().toString());
//		c1.draw();
//		
////		Circle c2 = new Circle(new Point(200, 300), 50);
//		Circle c2 = new Circle();
////		c2.setCenter(new Point(200, 300));
//		Point point = new Point(200, 300);
//		c2.setCenter(point);
//		c2.setR(50);
//		c2.draw();
		
		Point[] points = {new Point(0,0), new Point(200,0), 
				new Point(200,100), new Point(0,100)};
        Rectangle rect = new Rectangle(points, 200, 100);
        rect.draw();
        
        System.out.println("사각형의 너비는 " + rect.getArea() + "입니다.");
        System.out.println(rect);
		
		

	}

}
