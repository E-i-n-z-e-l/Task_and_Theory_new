package ArkhitekturaPO.Practocal.Practical_2.Pattern_Prototype;

public class Main {
    public static void main(String[] args) {
        SolidMedicines solid = new SolidMedicines("Парацетамол");
        LiquidMedicines liquid = new LiquidMedicines("Лазолван");

        SolidMedicines clonesolid = (SolidMedicines) solid.clone();
        LiquidMedicines cloneliquid = (LiquidMedicines) liquid.clone();

        System.out.println("Клон парацетамола: " + clonesolid.getName());
        System.out.println("Клон Лазолвана: " + cloneliquid.getName());

    }
}
