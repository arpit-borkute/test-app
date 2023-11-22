package com.app.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

public class ReadLineProgram {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Kalpesh\\OneDrive\\Desktop\\Task.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		int count = 0;
		while ((st = br.readLine()) != null) {
			count++;
			if (count==5) {
				System.out.println(st);
				break;
			}
		}
			

	}
	
	private void print() {
		System.out.println("I am invisible");
	}

}
