package ArkhitekturaPO.Practical_3.ISP;

class MultiFunctionDevice implements Printer, Scanner {
    public void print() {
        System.out.println("Многофункциональная печать документа");
    }

    public void scan() {
        System.out.println("Многофункциональное сканирование документа");
    }
}
