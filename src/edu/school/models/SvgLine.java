package edu.school.models;

import java.awt.Color;

public class SvgLine extends SvgObject {

	private int endX;
	private int endY;

	public SvgLine(int startX, int startY, int endX, int endY,
			Color strokeColor, int strokeWidth) {
		super(startX, startY, strokeColor, strokeWidth);
		setEndX(endX);
		setEndY(endY);
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		if (endX >= 0) {
			this.endX = endX;
			return;
		}
		throw new IllegalArgumentException("EndX must be greater than or equal to 0");
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		if (endY >= 0) {
			this.endY = endY;
			return;
		}
		throw new IllegalArgumentException("EndY must be greater than or equal to 0");
	}

	@Override
	public String toSvgCode() {
		String result = "<line ";
		result += "x1=\"" + getX() + "\" y1=\"" + getY() + "\" ";
		result += "x2=\"" + getEndX() + "\" y2=\"" + getEndY() + "\" ";
		result += "stroke=\"" + toRGB(getColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		return result;
	}

}
