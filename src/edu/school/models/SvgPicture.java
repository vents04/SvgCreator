package edu.school.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SvgPicture {
	private SvgObject[] objects;
	private int index;

	public SvgPicture() {
		objects = new SvgObject[3];
		index = 0;
	}

	public void add(SvgObject object) {
		if (object != null) {
			if (index >= objects.length) {
				SvgObject[] updatedObjects = new SvgObject[objects.length + 1];
				for (int innerIndex = 0; innerIndex < objects.length; innerIndex++) {
					updatedObjects[innerIndex] = objects[innerIndex];
				}
				objects = updatedObjects;
			}
			objects[index] = object;
			index++;
			return;
		}
		throw new IllegalArgumentException("You should provide a non-null object to the SVGPicture.add function");
	}

	public String toString() {
		String result = "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 500 500\">";
		for (int i = 0; i < index; i++) {
			result += objects[i].toSvgCode();
		}
		result += "</svg>";
		return result;
	}

	public void saveToFile(String filepath) {
		try {
			Files.writeString(Paths.get(filepath),
					toString(), StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
