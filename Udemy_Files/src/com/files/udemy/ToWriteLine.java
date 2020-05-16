package com.files.udemy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToWriteLine {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./Resource/Write_Create.txt");

		List<String> list = List.of("Shubham", "kulkarni", "Divyansh", "chandan");

		Files.write(pathFileToWrite, list);

	}

}
