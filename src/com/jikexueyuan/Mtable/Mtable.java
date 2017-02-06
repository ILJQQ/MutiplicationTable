package com.jikexueyuan.Mtable;

public class Mtable {
	public static void main(String[] args){
		System.out.println("九九乘法表");
		//dual loop
		for(int i = 1; i < 10; i++) {
			for(int j =1; j <= i;j++){
				line(i,j);
				// inert a space between each equation
				System.out.print(" ");
			}
			// restart a new line as i adding up
			System.out.println();
		}
	}
	//a method to print each single line
	public static void line(int i, int j) {
		int result = i*j;
		System.out.print (j + " x " + i + " = " + result);
	}
}
