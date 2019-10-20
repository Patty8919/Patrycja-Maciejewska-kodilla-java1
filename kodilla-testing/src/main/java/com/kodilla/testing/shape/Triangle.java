package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final static String name = "Triangle";
    private double lengthA;
    private double lengthB;
    private double lengthC;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.lengthA, lengthA) != 0) return false;
        if (Double.compare(triangle.lengthB, lengthB) != 0) return false;
        return Double.compare(triangle.lengthC, lengthC) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(lengthA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lengthB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lengthC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Triangle(double edgeLengthA, double edgeLengthB, double edgeLengthC) {

        this.lengthA = edgeLengthA;
        this.lengthB = edgeLengthB;
        this.lengthC = edgeLengthC;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        if(checkTriangleCondition()){
            double halfOfCircuit = getHalfOfCircuit();
            return heronsPattern(halfOfCircuit);
        } else {
            return 0;
        }
    }

    private boolean checkTriangleCondition(){
        return(lengthA + lengthB > lengthC &&
                lengthA + lengthC > lengthB &&
                lengthB + lengthC > lengthA);
    }

    private double getHalfOfCircuit(){
        return (lengthA + lengthB + lengthC)/2;
    }

    private double heronsPattern(double halfOfCircuit) {
        return Math.sqrt(halfOfCircuit*(halfOfCircuit-lengthA)*(halfOfCircuit-lengthB)*(halfOfCircuit-lengthC));
    }
}
