package com.fundamentals;

public class Main {

	public static void main(String[] args) {

		FileSearchProcessor impl = new FileSearchImpl();

		System.out.println(impl.findUniqueStrings(null));

		System.out.println(impl.countUniqueKeys(null));

		System.out.println(impl.searchCount(null, "software"));
	}

}
