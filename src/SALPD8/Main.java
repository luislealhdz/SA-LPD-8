package SALPD8;

import java.util.Scanner;

public class Main {
	
	private static boolean isPrimeNumber(int number) {
		if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	private static void orderArray(int[] numbers){
		for (int i = 0, j = numbers.length - 1; i < j; ) {
            if (isPrimeNumber(numbers[i])) {
                i++;
            } else {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                j--;
            }
        }
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		int [] numbers = new int[10];
		
        System.out.println("Ingrese 10 números:");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Array original");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+ "-" + numbers[i]);
        }
        
        orderArray(numbers);
        
        System.out.println("Array modificado");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+ "-" + numbers[i]);
        }
        
        
        scanner.close();
        

	}

}
