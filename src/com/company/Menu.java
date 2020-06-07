package com.company;
import java.util.Scanner;
public class Menu {
    void startMenu(){
        Scanner in = new Scanner(System.in);
        Function arcsin = new Arcsin();
        Function arccos = new Arccos();
        while (true) {
            System.out.println("Введите значение(нецелое значение вводить через запятую)");
            double value = in.nextDouble();
            arcsin.setValue(value);
            arccos.setValue(value);
            System.out.println("Арксинус для данного значения " + arcsin.calculateFunction());
            ;
            System.out.println("Производная арксинуса для данного значения " + arcsin.calculateDerivative());
            System.out.println("Арккосинус для данного значения " + arccos.calculateFunction());
            System.out.println("Производная арккосинуса для данного значения " + arccos.calculateDerivative());
        }
    }
}
