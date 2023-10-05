package ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.model;

import ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.model.substractOperation.SubstractOperation;
import ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
    public double add(double a, double b) {
        SumOperation sumOperation = new SumOperation(a,b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        SubstractOperation substractOperation = new SubstractOperation(a,b);
        return substractOperation.subtract();
    }

    public double multiply(double a, double b) {
        // Умножение
        return 1.0;
    }

    public double divide(double a, double b) {
        // Деление
        return 1.0;
    }
}
