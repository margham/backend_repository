package week03;

public class more_methods {

	public static void main(String[] args) {
		
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;
		
		System.out.println(calculateAverage(grades));
	
		System.out.println(multiplyString("Hello", 3));
	}
	
		// TODO Auto-generated method stub
		public static int sumArray(int[] numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			return sum;
		}
		
		public static double calculateAverage(double[] numbers) {
			double sum = 0;
			for (double number:numbers) {
				sum += number;
			}
			return sum / numbers.length;
		}
		
		public static String multiplyString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}
	}

