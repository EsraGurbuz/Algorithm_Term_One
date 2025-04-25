/***********************************************************************
@Title:	    GurbuzEsraWashingtonTemp.java
@Purpose:	To get familiar with arrays and their usage
@Author:    Gurbuz Esra
@Date:   	01.13.2025
@Version:	1.0
************************************************************************/

import java.util.Random;
import java.util.ArrayList;

public class GurbuzEsraWashingtonTemperatures {
	public static void main(String[] args) {

		Random randomValues = new Random();

		int[] year = new int[366];

		//For January
		int sumJanuary = 0;
		double averageJanuary = 0;
		for(int i = 0; i < 31; i++){
			year[i] = randomValues.nextInt(11)+ 28;
			sumJanuary += year[i];
		}
		averageJanuary = (double) sumJanuary / 31;
		System.out.printf("The average temperature in January: %.1f%n", averageJanuary);

		//For February
		int sumFebruary = 0;
		double averageFebruary = 0;
		for(int i = 31; i < 60; i++){
			year[i] = randomValues.nextInt(13)+ 28;
			sumFebruary += year[i];
		}
		averageFebruary = (double) sumFebruary / 29;
		System.out.printf("The average temperature in February: %.1f%n", averageFebruary);

		//For March
		int sumMarch = 0;
		double averageMarch = 0;
		for(int i = 60; i < 91; i++){
			year[i] = randomValues.nextInt(13)+ 36;
			sumMarch += year[i];
		}
		averageMarch = (double) sumMarch / 31;
		System.out.printf("The average temperature in March: %.1f%n", averageMarch);

		//For April
		int sumApril = 0;
		double averageApril = 0;
		for(int i = 91; i < 121; i++){
			year[i] = randomValues.nextInt(14)+ 45;
			sumApril += year[i];
		}
		averageApril = (double) sumApril / 30;
		System.out.printf("The average temperature in April: %.1f%n", averageApril);

		//For May
		int sumMay = 0;
		double averageMay = 0;
		for(int i = 121; i < 152; i++){
			year[i] = randomValues.nextInt(13)+ 56;
			sumMay += year[i];
		}
		averageMay = (double) sumMay / 31;
		System.out.printf("The average temperature in May: %.1f%n", averageMay);

		//For June
		int sumJune = 0;
		double averageJune = 0;
		for(int i = 152; i < 182; i++){
			year[i] = randomValues.nextInt(15)+ 63;
			sumJune += year[i];
		}
		averageJune = (double) sumJune / 30;
		System.out.printf("The average temperature in June: %.1f%n", averageJune);

		//For July
		int sumJuly = 0;
		double averageJuly = 0;
		for(int i = 182; i < 213; i++){
			year[i] = randomValues.nextInt(12)+ 72;
			sumJuly += year[i];
		}
		averageJuly = (double) sumJuly / 31;
		System.out.printf("The average temperature in July: %.1f%n", averageJuly);


		//For August
		int sumAugust = 0;
		double averageAugust = 0;
		for(int i = 213; i < 244; i++){
			year[i] = randomValues.nextInt(12)+ 64;
			sumAugust += year[i];
		}
		averageAugust = (double) sumAugust / 31;
		System.out.printf("The average temperature in August: %.1f%n", averageAugust);

		//For September
		int sumSeptember = 0;
		double averageSeptember = 0;
		for(int i = 244; i < 274; i++){
			year[i] = randomValues.nextInt(15)+ 51;
			sumSeptember += year[i];
		}
		averageSeptember = (double) sumSeptember / 30;
		System.out.printf("The average temperature in September: %.1f%n", averageSeptember);

		//For October
		int sumOctober = 0;
		double averageOctober = 0;
		for(int i = 274; i < 305; i++){
			year[i] = randomValues.nextInt(12)+ 43;
			sumOctober += year[i];
		}
		averageOctober = (double) sumOctober / 31;
		System.out.printf("The average temperature in October: %.1f%n", averageOctober);

		//For November
		int sumNovember = 0;
		double averageNovember = 0;
		for(int i = 305; i < 335; i++){
			year[i] = randomValues.nextInt(11)+ 33;
			sumNovember += year[i];
		}
		averageNovember = (double) sumNovember / 30;
		System.out.printf("The average temperature in November: %.1f%n", averageNovember);

		//For December
		int sumDecember = 0;
		double averageDecember = 0;
		for(int i = 335; i < 366; i++){
			year[i] = randomValues.nextInt(12)+ 50;
			sumDecember += year[i];
		}
		averageDecember = (double) sumDecember/ 31;
		System.out.printf("The average temperature in December: %.1f%n", averageDecember);
		System.out.println();


		String[] weekDays = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};

		ArrayList<String> allDays = new ArrayList<>();

		for(int i = 0; i < 366; i++) {
			int decision = i % 7;
			String day = weekDays[decision];
			allDays.add(day);
		}

		int hottest = year[0];
		int coldest = year[0];
		int hottestIndex = 0;
		int coldestIndex = 0;
		for(int i = 0; i < year.length; i++) {
			if(year[i] > hottest) {
				hottest = year[i];
				hottestIndex = i;
			}
			if(year[i] < coldest) {
				coldest = year[i];
				coldestIndex = i;
			}
		}

		int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] monthNames = {"January", "February ", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


		String hottestMonth = "";
		int hottestDay = hottestIndex + 1;

		for(int h = 0; h < 12; h++) {
			if(hottestDay <= daysOfMonth[h]) {
				hottestMonth = monthNames[h];
				break;
			} else {
				hottestDay -= daysOfMonth[h];
			}
		}

		String coldestMonth = "";
		int coldestDay = coldestIndex + 1;

		for(int h = 0; h < 12; h++) {
			if(coldestDay <= daysOfMonth[h]) {
				coldestMonth = monthNames[h];
				break;
			} else {
			coldestDay -= daysOfMonth[h];
			}
		}

		System.out.println("The hottest day in the entire year was on " + allDays.get(hottestIndex) + ", " + hottestMonth + " " + hottestDay);
		System.out.println("It was " + year[hottestIndex] + "°F on this day.");
		System.out.println("The coldest day in the entire year was on " + allDays.get(coldestIndex) + ", " + coldestMonth + " " + coldestDay);
		System.out.println("It was " + year[coldestIndex] + "°F on this day.");
		System.out.println();

		int below33 = 0;
		int more75 = 0;
		for(int i = 0; i < year.length; i++) {
			if(year[i] < 33) {
				below33++;
			}
			if(year[i] > 75) {
				more75++;
			}
		}
		System.out.println("There were " + more75 + " days where the temperature was above 75 degrees");
		System.out.println("There were " + below33 + " days where the temperature was below 33 degrees");


	}
}
