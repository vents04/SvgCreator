package edu.school.tests;

import java.awt.Color;

import edu.school.models.SvgCircle;
import edu.school.models.SvgLine;
import edu.school.models.SvgPicture;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgRectangle;
import edu.school.models.SvgPolygon;

public class Test {
	public static void main(String[] args) {
		SvgPicture pic = new SvgPicture();
		pic.add(new SvgLine(10, 10, 180, 250, Color.red, 5));
		pic.add(new SvgLine(280, 10, 0, 368, Color.blue, 1));
		pic.add(new SvgCircle(25, 75, Color.red, 20, Color.blue, 5));
		pic.add(new SvgRectangle(10, 10, Color.red, 5, 30, 30, Color.blue));
		pic.add(new SvgEllipse(75, 75, Color.blue, 20, Color.red, 5, 10));
		pic.add(new SvgPolygon(Color.blue, Color.red, 5, 50, 160, 55, 180, 70, 180, 60, 190, 65, 205, 50, 195, 35, 205,
				40, 190, 30, 180, 45, 180));
		pic.saveToFile("C:\\Users\\Legion\\Documents\\2021_2022_school\\class11i2021\\SvgCreator\\test.svg");
	}

}
