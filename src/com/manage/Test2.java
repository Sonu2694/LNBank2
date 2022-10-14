package com.manage;

import com.google.gson.Gson;
import com.ln.pojo.User;

public class Test2 {


	public static void main(String[] args) {

		String input1 = "{\"age\":32, \"gender\":\"Male\", \"name\":\"Lalit\"}";

		String d1 = input1.replace("{ ", "").replace("}", "");
		System.out.println(d1);
		String[] d2 = d1.split(",");
		
		String s = (d2[0].split(":"))[1];
		Integer s2 = Integer.parseInt(s);
		
		String s1 = (d2[1].split(":"))[1];
		
		String s3 = (d2[2].split(":"))[1];

//		String[] s4 = {s1, s2, s3};
//		System.out.println(s4[2]);
		
		User u = new User();
		
		for(String l1 : input1.split(",")) {
			String[]  r1 = l1.split(":");
			if(r1[0].equalsIgnoreCase("name")) {
				u.setName(r1[1]);	
			}else if(r1[0].equals("age")) {
				u.setAge(Integer.parseInt(r1[1]));
			}else if(r1[0].equals("gender")) {
				u.setGender(r1[1]);
			}
		}
		
		User u3 = new Gson().fromJson(input1, User.class);
		
		User []list = {new User(), new User()};
		
 		System.out.println(new Gson().toJson(u3).toString());
		
		u.setAge(s2);
		u.setGender(s3);
		u.setName(s);
		u3.getMob();

		String input2 = "<data><name>Lalit</name><age>32</age><gender>Male</gender></data>";

		String p1 = input2.replace("data", "").replace("name", "").replace("age", "").replace("gender", "");
		String p2 = p1.replace("<>", "").replace("</></>", "");

		String[] p3 = p2.split("</>");
		System.out.println(p3[0]);

		System.out.println("");
		
		

	}
}
