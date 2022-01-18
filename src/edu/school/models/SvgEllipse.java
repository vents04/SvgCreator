package edu.school.models;

import java.awt.Color;

public class SvgEllipse extends SvgCircle {

    private double rY; // rX used as the SVGCircle r

    public SvgEllipse(int cx, int cy, Color strokeColor, double radiusX, Color fillColor, double strokeWidth,
            double radiusY) {
        super(cx, cy, strokeColor, radiusX, fillColor, strokeWidth);
        setrY(radiusY);
    }

    @Override
    public String toSvgCode() {
        String result = "<ellipse ";
        result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
        result += "rx=\"" + getRadius() + "\" ";
        result += "ry=\"" + getrY() + "\" ";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        result += "stroke-width=\"" + getStrokeWidth() + "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" />";
        return result;
    }

    public double getrY() {
        return rY;
    }

    public void setrY(double rY) {
        if (rY > 0) {
            this.rY = rY;
            return;
        }
        throw new IllegalArgumentException("rY must be greater than 0");
    }

}
