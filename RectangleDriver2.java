public class RectangleDriver2 {
	public static void main(String[] args) {
		//Create three object, 1st use the 1st construvtor
		//2nd use the second constructor, 3rd use the methodd to
		//initilize the fields
		Rectangle box1 = new Rectangle();
		System.out.println("The area is " + box1.getArea());
		Rectangle box2 = new Rectangle(5.0, 6.0);
		System.out.println("The area is " + box2.getArea());
		Rectangle box3 = new Rectangle();
		box3.setLength(10.0);
		box3.setWidth(15.0);
		System.out.println("The area is " + box3.getArea());
	}
}