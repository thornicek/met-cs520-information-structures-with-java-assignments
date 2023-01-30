package cs520.hw1;

import javax.swing.JOptionPane;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input, output;
		
		
		
		input = JOptionPane.showInputDialog("How much money do you want to withdraw?");
		
		int amount = Integer.parseInt(input);
		System.out.println("Requested amount = " + amount);
		
		int hundreds, fifties, twenties, tens, fives, twos, ones;
		int remainingAmount;
		
		hundreds = amount/100;
		System.out.print("Hundreds = " + hundreds + ", ");
		remainingAmount = amount%100; 	
		System.out.println("Remaining amount = " + remainingAmount);
		
		fifties = remainingAmount/50;
		System.out.print("Fifties = " +fifties + ", ");
		remainingAmount %= 50;
		System.out.println("Remaining amount = " +remainingAmount);
		
		twenties = remainingAmount/20;
		System.out.print("Twenties = " + twenties + ", ");
		remainingAmount %= 20;
		System.out.println("Remaining amount = " +remainingAmount);
		
		tens = remainingAmount/10;
		System.out.print("Tens = " + tens + ", ");
		remainingAmount %= 10;
		System.out.println("Remaining amount = " +remainingAmount);
		
		fives = remainingAmount/5;
		System.out.print("Fives = " + fives + ", ");
		remainingAmount %= 5;
		System.out.println("Remaining amount = " +remainingAmount);
		
		twos = remainingAmount/2;
		System.out.print("Twos = " + twos + ", ");
		remainingAmount %= 2;
		System.out.println("Remaining amount= " +remainingAmount);
		
		ones = remainingAmount/1;
		System.out.print("Ones = " +ones);
		
		output = "Requested amount ("+amount+") \n Hundreds ("+hundreds+")\n Fifties ("+fifties+") \n Twenties ("+twenties+") "
				+ "\n Tens ("+tens+") \n Fives ("+fives+") \n Twos ("+twos+") \n Ones ("+ones+")";
		JOptionPane.showMessageDialog(null,output);
		
	}

}
