package day21._09_NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyDemo {
	public static void main(String[] args) throws Exception {
		
		Files.copy(Paths.get("file/stream.txt"), new FileOutputStream("file/copy.txt"));
		//Files.copy(Paths.get(new File("file/stream.txt").toURI()), new FileOutputStream("file/copy.txt"));
		Files.copy(new FileInputStream("file/stream.txt"),Paths.get("file/oo.txt"));
	}
}
