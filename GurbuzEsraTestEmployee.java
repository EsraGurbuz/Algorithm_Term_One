/***********************************************************************
@Title:	    GurbuzEsraTestEmployee.java
@Purpose:	To get familiar with usage of methods defined in a class
@Author:    Gurbuz Esra
@Date:   	01.13.2025
@Version:	1.0
************************************************************************/

public class GurbuzEsraTestEmployee {
	public static void main(String[] args) {

		GurbuzEsraEmployee firstEmployee = new GurbuzEsraEmployee();

		firstEmployee.setName("Bilbo Baggins");
		firstEmployee.setId(15);
		firstEmployee.setSalary(40000);
		firstEmployee.setAge(111);
		firstEmployee.setPosition("Senior");

		System.out.println("First Employee");
		System.out.println("First employee's name is " + firstEmployee.getName());
		System.out.println("First employee's Id is " + firstEmployee.getId());
		System.out.println("First employee's salary is " + firstEmployee.getSalary());
		System.out.println("First employee's age is " + firstEmployee.getAge());
		System.out.println("First employee's position is " + firstEmployee.getPosition());
		System.out.println("First employee's federal tax is " + firstEmployee.getFedTax());
		System.out.println("First employee's social security tax is " + firstEmployee.getSsTax(6));
		System.out.println("First employee's health fee is " + firstEmployee.getHealthFee(8));
		System.out.println("First employee's insurance is " + firstEmployee.getInsurance());
		System.out.println("First employee's net pay is " + firstEmployee.getNetPay());
		System.out.println();

		GurbuzEsraEmployee secondEmployee = new GurbuzEsraEmployee();

		secondEmployee.setName("Frodo Baggins");
		secondEmployee.setId(1);
		secondEmployee.setSalary(30000);
		secondEmployee.setAge(33);
		secondEmployee.setPosition("Junior");

		System.out.println("Second Employee");
		System.out.println("Second employee's name is " + secondEmployee.getName());
		System.out.println("Second employee's Id is " + secondEmployee.getId());
		System.out.println("Second employee's salary is " + secondEmployee.getSalary());
		System.out.println("Second employee's age is " + secondEmployee.getAge());
		System.out.println("Second employee's position is " + secondEmployee.getPosition());
		System.out.println("Second employee's federal tax is " + secondEmployee.getFedTax());
		System.out.println("Second employee's social security is " + secondEmployee.getSsTax(6));
		System.out.println("Second employee's health fee is " + secondEmployee.getHealthFee(8));
		System.out.println("Second employee's insurance is " + secondEmployee.getInsurance());
		System.out.println("Second employee's net pay is " + secondEmployee.getNetPay());

	}
}
