package ArkhitekturaPO.Practical_2.Pattern_Builder;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник {Имя - " + firstName + ", Фамилия - " + secondName + ", Возраст - " + age + "}";
    }
}
