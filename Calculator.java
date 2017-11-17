package com.mayank.CalculatorDemo;

import java.util.Scanner;

public class Calculator {

	
	
	public void selectCalc() {
		System.out.println("Select the calculator type:");
		System.out.println("For Basic Calculator, press 1");
		System.out.println("For Advance Calculator, press 2");
		System.out.println("For Exit, press 0");
		Scanner scanner = new Scanner(System.in);
		if(scanner.nextInt()==1) {
			BasicCalc basicCalc = new BasicCalc();
			basicCalc.selectOperation();
		}
		else if(scanner.nextInt()==2) {
			AdvanceCalc advanceCalc = new AdvanceCalc();
			advanceCalc.selectOperation();
		}
		else if(scanner.nextInt()==0)
			System.exit(0);
		else {
			System.out.println("Invalid Selection");
			selectCalc();
		}
		scanner.close();			
	}
	public static void main(String[] args) {
		System.out.println("***********************CALCULATOR*****************************");
		Calculator calculator = new Calculator();
		calculator.selectCalc();
	}
				

}
