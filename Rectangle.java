public class Rectangle {

	private double length;
	private double width;

	/*Construvtor #1 is a no argument construvotr which initilizes the length with 7.0 and the width with 15.0
	*/
	public Rectangle (){
		length = 7.0;
		width = 15.0;
	}

	/*Contructor number 2 is the second constructor
	@param1 l will initilize the length field
	@param2 w will initilize the width field
	*/

	public Rectangle(double l, double w){
		length = l;
		width = w;
	}

	/*The setLength() method sets a double value to the length field
	@param1 len will be stored in length
	*/

	public void setLength(double len){
		length = len;
	}

	/*The setWidth() method sets a double value to the width field
	@param1 w will be stored in width
	*/

	public void setWidth(double w) {
		width = w;
	}

	/*The getLength() method returns the length of the obcejt
	@return length
	*/

	public double getLength() {
		return length;
	}

	/*The getWidth() method returns the width of the object
	@return width
	*/

	public double getWidth() {
		return width;
	}

	/*The getArea() method returns the area of the object
	@return the area
	*/

	public double getArea() {
		return length * width;
	}

}