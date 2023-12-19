package com.acc.lkm.mavenpractical.MavenPractical;

import java.util.*;

public class App
{
	public static void main(String[] args) {
	    TreeMap<String, String> treeMap=new TreeMap<String, String>();
		treeMap.put("Java","Payment Portal");
		treeMap.put("Python","Weather app");
		treeMap.put("C++","Antivirus");
		for(Map.Entry m1:treeMap.entrySet()) {
			System.out.println(m1.getKey()+" : "+m1.getValue());
		}
}
}