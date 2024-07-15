package com.chainsys.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class removeDuplicatesInArray {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuffer strBuilder = new StringBuffer();
		Queue queue = new LinkedList<>();
		System.out.println("Enter the Size : ");
		int size = scanner.nextInt();
		int[] intArr = new int[size];
		System.out.println("Enter the Numbers : ");
		for(int i=0; i<size; i+=1) {
			intArr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<intArr.length; i+=1) {
			strBuilder.append(intArr[i]);
			if(i < intArr.length-1) {
				strBuilder.append(" ");
			}
		}
		queue.add(strBuilder);
		for(int i=0; i<queue.toArray().length; i+=1) {
			for(int j=i+1; j<=queue.size()-1; j+=1) {
				
			}
		}
		
	}
}
