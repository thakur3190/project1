package Test.com;

import java.util.ArrayList;
import java.util.HashMap;

public class Datadriven1 {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<>();
		a1.add("https://demo.actitime.com/");
		a1.add("admin");
		a1.add("admin@actitime.com");
		a1.add("manager");
		System.out.println(a1.get(2));
		HashMap<String,String> map= new HashMap<>();
		map.put("url", "https://demo.actitime.com/");
		map.put("username", "admin");
		map.put("email", "admin@actitime.com");
		map.put("password", "manager");
		System.out.println(map.get("password"));
	}

}
