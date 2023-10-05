package ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.view;

import ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.model.CalculationLayer;

public class ConsoleView implements IView {
    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    public ConsoleView() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    @Override
    public void runCalculator() {

        calcLayer.subtract(Double.parseDouble(ioLayer.getInput()), Double.parseDouble(ioLayer.getInput()));
    }
}
