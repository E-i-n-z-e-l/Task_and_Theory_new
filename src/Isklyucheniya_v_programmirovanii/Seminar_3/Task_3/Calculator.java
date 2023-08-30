package Isklyucheniya_v_programmirovanii.Seminar_3.Task_3;

import Isklyucheniya_v_programmirovanii.Seminar_3.Task_3.exceptions.BusinessLogicException;

public class Calculator {
    public static double divide(double num1, double num2) throws BusinessLogicException {
        if (num2 == 0) {
            throw new BusinessLogicException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
