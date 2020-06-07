package com.company;

abstract public class Function {

    protected double value;

    abstract public void setValue(double value);

    abstract public double getValue();

    abstract public double calculateFunction();

    abstract public double calculateDerivative();
}
