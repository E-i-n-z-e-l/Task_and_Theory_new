package ArkhitekturaPO.Seminars.Seminar_3.ulmExample;

// Интерфейс для View
interface CalculatorView {
    void setObserver(ViewObserver observer);
    void updateResult(double result);
    void clearScreen();
}
