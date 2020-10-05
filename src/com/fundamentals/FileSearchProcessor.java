package com.fundamentals;

import java.io.File;
import java.util.List;

public interface FileSearchProcessor {

	public String readStringFromFile(File file);

	public List<String> findUniqueStrings(File file);

	public int searchCount(File file, String key);

	public int countUniqueKeys(File file);

}
