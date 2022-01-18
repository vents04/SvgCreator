package edu.school.models;

import java.awt.Color;

public class SvgCircle extends SvgObject {

    private double radius;
    private Color fillColor;

    public SvgCircle(int cx, int cy, Color strokeColor, double radius, Color fillColor, double strokeWidth) {
        super(cx, cy, strokeColor, strokeWidth);
        setRadius(radius);
        setFillColor(fillColor);
    }

    @Override
    public String toSvgCode() {
        String result = "<circle ";
        result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
        result += "r=\"" + getRadius() + "\" ";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" />";
        return result;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            return;
        }
        throw new IllegalArgumentException("Radius must be greater than 0");
    }

}
