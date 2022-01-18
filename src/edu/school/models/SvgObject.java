package edu.school.models;

import java.awt.Color;

public abstract class SvgObject {
	private int x;
	private int y;
	private Color color;
	private double strokeWidth;

	public SvgObject(int x, int y, Color color, double strokeWidth) {
		setX(x);
		setY(y);
		setColor(color);
		setStrokeWidth(strokeWidth);
	}

	public SvgObject(Color color, double strokeWidth) {
		setColor(color);
		setStrokeWidth(strokeWidth);
	}

	public SvgObject(int x, int y) {
		this(x, y, Color.BLACK, 1);
	}

	public SvgObject() {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
			return;
		}
		throw new IllegalArgumentException("X must be greater than or equal to 0");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
			return;
		}
		throw new IllegalArgumentException("Y must be greater than or equal to 0");
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(double strokeWidth) {
		if (strokeWidth > 0) {
			this.strokeWidth = strokeWidth;
			return;
		}
		throw new IllegalArgumentException("Stroke width must be greater than zero");
	}

	public abstract String toSvgCode();

	protected String toRGB(Color color) {
		if (color == null)
			return "";
		String result = "rgb(";
		result += color.getRed() + ",";
		result += color.getGreen() + ",";
		result += color.getBlue() + ")";
		return result;
	}
}
