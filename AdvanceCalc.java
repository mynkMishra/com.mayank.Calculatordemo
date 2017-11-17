package com.mayank.CalculatorDemo;

import java.util.Scanner;

public class AdvanceCalc implements BasicCalcInterface, AdvanceCalcInterface{

	
	public void selectOperation() {
		
		System.out.println("___________ADVANCE CALCULATOR____________");
		System.out.println("For addition, press 1");
		System.out.println("For subtraction, press 2");
		System.out.println("For multiplication, press 3");
		System.out.println("For division, press 4");
		System.out.println("For sin Function, press 5");
		System.out.println("For cos Function, press 6");
		System.out.println("For tan Function, press 7");
		System.out.println("For cosec Function, press 8");
		System.out.println("For sec Function, press 9");
		System.out.println("For cot Function, press 10");
		System.out.println("For BASIC Calculator, press 0");
		System.out.println("For exit, press 99");
		Scanner scanner = new Scanner(System.in);
		if(scanner.nextInt()==1) {
			System.out.println("enter the numbers");
			System.out.println("Result : " + add(scanner.nextInt()));
			selectOperation();
		}
		else if(scanner.nextInt()==2) {
			System.out.println("enter the numbers");
			System.out.println("Result : " + subtract(scanner.nextInt()));
			selectOperation();
			
		}
		else if(scanner.nextInt()==3) {
			System.out.println("enter the numbers");
		    System.out.println("Result : " + product(scanner.nextInt()));
		    selectOperation();
		    }
		else if(scanner.nextInt()==4) {
			System.out.println("enter the numbers");
		     System.out.println("Result : " + divide(scanner.nextInt()));
		     selectOperation();
		}
		else if(scanner.nextInt() == 5)
		{
			sinFunction();
			selectOperation();
		}
		else if(scanner.nextInt() == 6)
		{
			cosFunction();
			selectOperation();
		}
		else if(scanner.nextInt() == 7)
		{
			tanFunction();
			selectOperation();
		}
		else if(scanner.nextInt() == 8)
		{
			cosecFunction();
			selectOperation();
		}
		else if(scanner.nextInt() == 9)
		{
			secFunction();
			selectOperation();
		}
		else if(scanner.nextInt() == 10)
		{
			cotFunction();
			selectOperation();
		}
		else if(scanner.nextInt() == 0)
		{
			BasicCalc basicCalc = new BasicCalc();
			basicCalc.selectOperation();
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
	public void sinFunction() {
		System.out.println("this is sin function");
	}

	@Override
	public void cosFunction() {
		System.out.println("this is cos function");		
	}

	@Override
	public void tanFunction() {
		System.out.println("this is tan function");		
	}

	@Override
	public void cosecFunction() {
		System.out.println("this is cosec function");
	}
	@Override
	public void secFunction() {
		System.out.println("this is sec function");		
	}
	@Override
	public void cotFunction() {
		System.out.println("this is cot function");		
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
