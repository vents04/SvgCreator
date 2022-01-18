package edu.school.models;

import java.awt.Color;

public class SvgRectangle extends SvgObject {

    private double width, height;
    private Color fillColor;

    public SvgRectangle(int x, int y, Color strokeColor, double strokeWidth, double width, double height,
            Color fillColor) {
        super(x, y, strokeColor, strokeWidth);
        setWidth(width);
        setHeight(height);
        setFillColor(fillColor);
    }

    @Override
    public String toSvgCode() {
        String result = "<rect ";
        result += "x=\"" + getX() + "\" y=\"" + getY() + "\" ";
        result += "width=\"" + getWidth() + "\" ";
        result += "height=\"" + getHeight() + "\" ";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" />";
        return result;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
            return;
        }
        throw new IllegalArgumentException("Height must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            return;
        }
        throw new IllegalArgumentException("Width must be greater than 0");
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

}
