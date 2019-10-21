package com.exercise14OOPMathematics.app;
import java.util.Scanner;
import com.exercise14OOPMathematics.model.MathematicsOperations;
public class MathematicsApp {

	public static void main(String[] args) {
//Variables
		double b=0;
		double h=0;
		double r=0;
		double s=0;
		double Answer=0;
		
//Objects and  imports
		Scanner input = new Scanner(System.in);
		System.out.println("Input base:");
		b=input.nextDouble();
		System.out.println("Input Height:");
		h=input.nextDouble();
		Answer = MathematicsOperations.areaTriangle(b,h);
		System.out.println("Triangle area:"+Answer);
		
	}

}
