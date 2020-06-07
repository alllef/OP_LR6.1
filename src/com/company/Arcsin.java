package com.company;

public class Arcsin extends Function{


    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value=value;
    }

    @Override
    public double calculateFunction() {
     return    Math.asin(value)/Math.toRadians(1);
    }

    @Override
    public double calculateDerivative() {
        return 1/Math.sqrt(1-Math.pow(value,2));
    }
}
