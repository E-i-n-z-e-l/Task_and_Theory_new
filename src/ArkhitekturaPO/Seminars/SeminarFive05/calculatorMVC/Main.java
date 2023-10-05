package ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC;

import ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.view.ConsoleView;
import ArkhitekturaPO.Seminars.SeminarFive05.calculatorMVC.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}
