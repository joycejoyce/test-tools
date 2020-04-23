package io.github.joycejoyce.javafileapi;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JavaFileAPI {

	public static String getParentFolderName(String pathStr) {
		Path path = Paths.get(pathStr);
		return path.getName(path.getNameCount()-2).toString();
	}

	public static void printLevelOneFolderNames(String pathStr) {
		List<File> subDirs = Arrays.asList(new File(pathStr).listFiles());
		subDirs.forEach(file -> {
			System.out.println(file.getName());
		});
	}
	
}
