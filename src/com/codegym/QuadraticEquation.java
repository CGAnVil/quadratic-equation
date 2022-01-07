package com.codegym;

public class QuadraticEquation {
    private double a, b, c;
public QuadraticEquation(){

}
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String showEquation(){
        return "The equation is:" + this.a + "x^2 + " + this.b + "x + c = 0";
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1;
        if (this.getDiscriminant() < 0) {
            r1 = 0;
        } else {
            r1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2;
        }
        return r1;
    }

    public double getRoot2(){
        double r2;
        if (this.getDiscriminant() < 0) {
            r2 = 0;
        } else {
            r2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2;
        }
        return r2;
    }
}
