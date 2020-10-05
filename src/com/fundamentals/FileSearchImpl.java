package com.fundamentals;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileSearchImpl implements FileSearchProcessor {

	List<String> allStrings;
	Set<String> uniqueStrings;

	public String readStringFromFile(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> findUniqueStrings(File file) {

		FileProcessorImpl fileProc = new FileProcessorImpl();
		String stringTocheck = fileProc.readFile(file);

		allStrings = new ArrayList<String>();
		uniqueStrings = new HashSet<String>();

		String[] tokens = stringTocheck.split(" ");

		for (String element : tokens) {
			allStrings.add(element);
			uniqueStrings.add(element);
		}

		List<String> listFromSet = new ArrayList<String>();

		for (String unique : uniqueStrings) {
			listFromSet.add(unique);
		}

		return allStrings;
	}

	public int searchCount(File file, String key) {

		findUniqueStrings(file);
		int counter = 0;
		for (String token : allStrings) {
			if (token.equals(key)) {
				counter++;
			}
		}
		return counter;
	}

	public int countUniqueKeys(File file) {
		findUniqueStrings(file);
		return uniqueStrings.size();
	}

}
