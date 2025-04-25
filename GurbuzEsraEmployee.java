/***********************************************************************
@Title:	    GurbuzEsraEmployee.java
@Purpose:	To get familiar with methods defined in a class
@Author:    GurbuzEsra
@Date:   	01.13.2025
@Version:	1.0
************************************************************************/


public class GurbuzEsraEmployee {
	private String name;
	private int id;
	private double salary;
	private int age;
	private String position;

	public GurbuzEsraEmployee() {
	}

	public GurbuzEsraEmployee(String name, int id, double salary, int age, String position) {
	}

	public void setName(String fullName) {
		name = fullName;
	}

	public void setId(int idNumber) {
		id = idNumber;
	}

	public void setSalary(double sal) {
		salary = sal;
	}

	public void setAge(int ag) {
		age = ag;
	}

	public void setPosition(String pos) {
		position = pos;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}

	public int getFedTax() {
		double fedTax = (getSalary()-800)*(0.17);
		return (int) Math.ceil(fedTax);
	}

	public int getSsTax(int rate) {
		double ssTax = getSalary() * (rate / 100.0);
		return (int) Math.ceil(ssTax);
	}

	public int getHealthFee(int rate) {
		double healthFee = getSalary() * (rate / 100.0);
		return (int) Math.ceil(healthFee);
	}

	public int getInsurance() {
		int rate;
		if(getAge() < 30){
			return rate = (int) (getSalary() * 0.02);
		} else if(getAge() >= 30 && age < 50) {
			return rate = (int) (getSalary() * 0.03);
		} else if(getAge() >= 50 && age < 70) {
			return rate = (int) (getSalary() * 0.04);
		} else {
			return rate = (int) (getSalary() * 0.1);
		}
	}

	public double getNetPay() {
		double netPay = getSalary() - (getFedTax() + getInsurance() + getSsTax(6) + getHealthFee(8));
		return netPay;
	}

}
