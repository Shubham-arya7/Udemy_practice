package com.files.udemy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class FilesExecuter {

	public static void main(String[] args) throws IOException {
		// Files.list(Paths.get(".")).forEach(e -> System.out.println(e));
		Path currndir = Paths.get(".");

		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

		Files.walk(currndir, 5).filter(predicate).forEach(System.out::println);
		// System.out.println(predicate);

		// BiPredicate<Path, BasicFileAttributes> matcher = (path, Attributes) ->
		// String.ValueOf(Attributes);
		// Files.find(currndir, 5, matcher);
	}

}
