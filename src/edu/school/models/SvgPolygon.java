package edu.school.models;

import java.awt.Color;

public class SvgPolygon extends SvgObject {

    private double points[];
    private Color fillColor;

    public SvgPolygon(Color strokeColor, Color fillColor, double strokeWidth, double... points) {
        super(strokeColor, strokeWidth);
        setFillColor(fillColor);
        setPoints(points);
    }

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double... points) {
        if (points.length > 1 && points.length % 2 == 0) {
            this.points = points;
            return;
        }
        throw new IllegalArgumentException(
                "Points array must have at least 2 elements and its length must be an even number");
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toSvgCode() {
        String pointsString = "";
        for (double point : getPoints()) {
            pointsString += point + " ";
        }
        String result = "<polygon ";
        result += "points=\"" + pointsString + "\" ";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" />";
        return result;
    }

}
