/*******************************************************************
@Title:	    GurbuzEsraAlgorithm&ProgrammingPet
@Purpose:	To practise the oop
@Author:    Gurbuz Esra
@Date:   	12.07.2024 7th of December 2024
@Version:	1.0
********************************************************************/

public class Pet{
	private String name;
	private int age;
	private String location;

	/*The setName() method set a String value to the name field
	@param1 n will be stoered in name
	*/

	public void setName(String n){
		name = n;
	}

	/*The setAge() method set an int value to the age field
	@param1 a will be stored in age
	*/

	public void setAge(int a){
		age = a;
	}

	/*The setLocation() method set a String value to the location field
	@param1 l will be stored in name
	*/

	public void setLocation(String l){
		location = l;
	}

	/*The getName() method returns the name of the object
	@return name
	*/

	public String getName(){
		return name;
	}

	/*The getAge() method returns the age of the object
	@return age
	*/

	public int getAge(){
		return age;
	}

	/*The getLocation() method returns the location of the object
	@return location
	*/

	public String getLocation(){
		return location;
	}

	/*The getCompleteInfo() method returns the whole information of the object
	@return
	*/

	public String getCompleteInfo(){
		return "The name of pet is " + name + ", the age is " + age + ", the location is " + location;
	}
}