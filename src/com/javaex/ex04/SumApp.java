package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		
//		int i = 0;
//		String a = "2";
//		System.out.println(a+i);
		
		String numLine = sc.nextLine();
		
		String[] sArray = numLine.split(" ");
		for(int i=0; i<sArray.length; i++) {
			sum = sum + Integer.parseInt(sArray[i]); 
			
			
		} 
		
		
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
