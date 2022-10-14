package com.manage;

import java.io.IOException;
import java.util.Scanner;

import com.calculator.Calculator;
import com.ln.Home;
import com.ln.pojo.User;

public class Test {

	public static void main(String[] args) throws IOException {
		Home hm = new Home();
		while(true) {
			System.out.println("Please select below options 0 ");
			System.out.println("1.Bank");
			System.out.println("2.Calculator");

			Scanner input = new Scanner(System.in);
			Integer entry = Integer.parseInt(input.nextLine());

			if(entry == 1) {
				
				hm.bank();

			}if(entry == 2) {	
				new Calculator().calculator();

			}


		}

	}

	public static User giveMeUserObject() {
		User u = new User();
		u.setName("Lalitt");
		u.setAge(32);
		u.setGender("Male");
		
		return u; 
	}
	
	
	public static String[] giveMeSomeCity() {
		String i [] = {"Chandrapur", "Nagpur", "Wani", "Pune", "Hyderabad", "Goa", "Jaipur"};
		return i;
	}
	
	public static void main1(String[] args) {
		
		
		
		String s1 = "{ name : Lalit, age : 32}";
		//System.out.println(s1);
		
		String s2 = "<data><name>Lalit</name><age>32</age></data>";
		///System.out.println(s2);
		
		User u  = giveMeUserObject();
		
		System.out.println("{ name : " + u.getName() + ", age : " + u.getAge() + "}");
		
		//System.out.println("<data><name>" + u.getName() + "</name><age>" + u.getAge() + "</age></data>");
		
		
	//	System.out.println("********************************");
		
		String[] city = giveMeSomeCity();
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(String c : city) {
			sb.append("name:");
			sb.append(c);
			sb.append(", ");
		}
		sb.append("}");
		
		
		System.out.println(sb.toString());
		
		//System.out.println("********************************");
		
		//System.out.println("<data>");
		for(int i = 0; i<city.length; i++) {
			//System.out.println("<name>" + city[i] + "</name>");
		}
		//System.out.println("</data>");
		
		
		/////
		
		String input1 = "{ name : Lalit, age : 32, gender:Male}";
		String input2 = "<data><name>Lalit</name><age>32</age><gender>Male</gender></data>";
		
		String array  = "Lalit, 32, Male,";
		String tt = "name : lalit";
		tt = tt.replace("{", "");
		
		System.out.println(tt);
		
		
		System.out.println(tt.substring(tt.indexOf("name : ")+"name : ".length(), tt.length()));
		String[] a2 = array.split(",");
		
		String[] a1 = {array.substring(0, array.indexOf(",")), array.substring(7,9), array.substring(11,15)};
		String d3 = array.substring(array.indexOf(",")+1, array.length());
		String d4 = d3.substring(0, d3.indexOf(","));
		System.out.println(d3);
		System.out.println(d4);
		
		String d5 = d3.substring(d3.indexOf(",")+1, d3.length());
		
		System.out.println(d5);
		System.out.println(a1);
		int o = array.indexOf(",");
		System.out.println(o);
	}
}
