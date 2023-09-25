package ArkhitekturaPO.Practical_2.Pattern_Prototype;

abstract class Medicines implements Cloneable{
    private String name;

    public Medicines(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Medicines clone();
}

class SolidMedicines extends Medicines{
    public SolidMedicines(String name) {
        super(name);
    }

    @Override
    public Medicines clone() {
        return new SolidMedicines(this.getName());
    }
}

class LiquidMedicines extends Medicines{
    public LiquidMedicines(String name) {
        super(name);
    }

    @Override
    public Medicines clone() {
        return new LiquidMedicines(this.getName());
    }
}


