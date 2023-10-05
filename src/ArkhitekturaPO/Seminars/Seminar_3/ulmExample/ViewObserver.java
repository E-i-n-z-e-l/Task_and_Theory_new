package ArkhitekturaPO.Seminars.Seminar_3.ulmExample;

// Интерфейс для Observer
interface ViewObserver {
    void onCalculate(String operation, double a, double b);
    void onClear();
}
