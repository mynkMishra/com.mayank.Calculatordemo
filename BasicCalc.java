package com.mayank.CalculatorDemo;

import java.util.Scanner;

public class BasicCalc implements BasicCalcInterface{

	
	public void selectOperation() {
		System.out.println("___________BASIC CALCULATOR____________");
		System.out.println("For addition, press 1");
		System.out.println("For subtraction, press 2");
		System.out.println("For multiplication, press 3");
		System.out.println("For division, press 4");
		System.out.println("For Advance Calculator, press 0");
		System.out.println("For exit, press 99");
		Scanner scanner = new Scanner(System.in);
		if(scanner.nextInt()==1) {
			System.out.println("enter the numbers");
			System.out.println("Result : " + add(scanner.nextInt()));
			selectOperation();
		}
		else if(scanner.nextInt()==2) {
			System.out.println("enter the numbers");
			System.out.println("Result : " + subtract());
			selectOperation();
			
		}
		else if(scanner.nextInt()==3) {
			System.out.println("enter the numbers");
		    System.out.println("Result : " + product());
		    selectOperation();
		    }
		else if(scanner.nextInt()==4) {
			System.out.println("enter the numbers");
		     System.out.println("Result : " + divide());
		     selectOperation();
		}
		else if(scanner.nextInt()==0) {
			AdvanceCalc advanceClac = new AdvanceCalc();
			advanceClac.selectOperation();
		}
		else if(scanner.nextInt()==99) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid Selection");
			selectOperation();
		}
			scanner.close();	
	}
	@Override
	public float add(float... args) {
		float sum = 0;
		for( float i:args)
			sum = args[(int)i] + sum;
		return sum;
	}

	@Override
	public float subtract(float... args) {
		float diff = 0;
		for( float i:args)
			diff = args[(int)i] - diff;
		return diff;
	}

	@Override
	public float product(float... args) {
		float pro = 1;
		for(float i:args)
			pro = args[(int)i]*pro;
		return pro;
	}

	@Override
	public float divide(float... args) {
		float q = 1;
		for(float i:args)
			q = args[(int)i]/args[(int)i++];
		return q;
	}

	
}
