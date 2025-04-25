/*******************************************************************
@Title:	    GurbuzEsraAlgorithm&ProgrammingTemperatureStuff
@Purpose:	To learn the methods and array in Java.
@Author:    Gurbuz Esra
@Date:   	12.21.2024 21th of December 2024
@Version:	1.0
********************************************************************/



public class GurbuzEsraLab8{

	public static double largestDailyDifferences(double arrayCelcius[]){
		double highest = arrayCelcius[0];
		double lowest = arrayCelcius[0];
		for(int l = 0; l < arrayCelcius.length; l++){
			if(arrayCelcius[l] > highest){
				highest = arrayCelcius[l];
			}
		}

		for(int m = 0; m < arrayCelcius.length; m++){
			if(arrayCelcius[m] < lowest){
				lowest = arrayCelcius[m];
			}
		}
		return highest - lowest;
	}


	public static double totalHourlyTemperatureVariation(double arrayCelcius[]){
		double absoluteTempVariation = 0;

		for(int e = 1; e < arrayCelcius.length; e++){
			double tempVariation = arrayCelcius[e] - arrayCelcius[e - 1];

			if(tempVariation < 0){
				tempVariation = -tempVariation;
			}
			absoluteTempVariation += tempVariation ;
		}

		return absoluteTempVariation;
	}

	public static double calculateAverage(double arrayCelcius[]){
		double sum = 0;

		for(int k = 0; k < arrayCelcius.length; k++){
			sum += arrayCelcius[k];
			}

		return sum / arrayCelcius.length;
		}

	public static double[] transformFahrenheitToCelcius(double arrayFahrenheit[]){
		double[] arrayCelcius = new double[12];

		for(int i = 0; i < arrayCelcius.length; i++){
			arrayCelcius[i] = 5.0 / 9 * (arrayFahrenheit[i] - 32);
			}

		return arrayCelcius;
		}

	public static void summarize(double averageNovember10th, double averageNovember11th, double temperatureVariationOfNovember10th, double temperatureVariationOfNovember11th, double largestDifferencesOfNovember10th, double largestDifferencesOfNovember11th){
		System.out.printf("The average temperature for November 10th is %.2f °C\n", averageNovember10th);
		System.out.printf("The average temperature for November 11th is %.2f °C\n", averageNovember11th);
		System.out.printf("The total temperature variation for November 10th is %.2f °C\n", temperatureVariationOfNovember10th);
		System.out.printf("The total temperature variation for November 11th is %.2f °C\n", temperatureVariationOfNovember11th);
		System.out.printf("The largest hourly temperature difference for November 10th is %.2f °C\n", largestDifferencesOfNovember10th);
		System.out.printf("The largest hourly temperature difference for November 11th is %.2f °C\n", largestDifferencesOfNovember11th);

	}

	public static void main(String[]args){
		double[] november10th = {45, 49, 53, 55, 60, 65, 70, 72, 68, 63, 58, 53 };
		double[] november11th = {42, 46, 50, 54, 59, 64, 69, 71, 67, 62, 57, 52};

		double[] celciusNovember10th = transformFahrenheitToCelcius(november10th);
		double[] celciusNovember11th = transformFahrenheitToCelcius(november11th);

		double averageNovember10th = calculateAverage(celciusNovember10th);
		double averageNovember11th = calculateAverage(celciusNovember11th);

		double temperatureVariationOfNovember10th = totalHourlyTemperatureVariation(celciusNovember10th);
		double temperatureVariationOfNovember11th = totalHourlyTemperatureVariation(celciusNovember11th);

		double largestDifferencesOfNovember10th = largestDailyDifferences(celciusNovember10th);
		double largestDifferencesOfNovember11th = largestDailyDifferences(celciusNovember11th);

		summarize(averageNovember10th, averageNovember11th, temperatureVariationOfNovember10th, temperatureVariationOfNovember11th, largestDifferencesOfNovember10th, largestDifferencesOfNovember11th);

		}
	}