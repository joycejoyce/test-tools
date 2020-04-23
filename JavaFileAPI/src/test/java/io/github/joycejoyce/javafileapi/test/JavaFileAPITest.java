package io.github.joycejoyce.javafileapi.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.github.joycejoyce.javafileapi.JavaFileAPI;

public class JavaFileAPITest {
	
	private final String ROOT_FOLDER = "C:\\Users\\Joyce\\Documents\\GitRepo_TestTools\\JavaFileAPI";
	private final String TEMPLATE_FOLDER = "template_folder"; 
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	@Test
	public void testGetParentFolderName() {
		String folderName;
		
		folderName = JavaFileAPI.getParentFolderName("C:/A/B");
		assertEquals(folderName, "A");
		
		folderName = JavaFileAPI.getParentFolderName("C:/A/B/x.txt");
		assertEquals(folderName, "B");
	}

	@Test
	public void testPrintLevelOneFolderNames() {
		JavaFileAPI.printLevelOneFolderNames(ROOT_FOLDER + "/" + TEMPLATE_FOLDER);
		assertTrue(outContent.toString().contains("20190802"));
		assertTrue(outContent.toString().contains("20190831"));
	}
}
