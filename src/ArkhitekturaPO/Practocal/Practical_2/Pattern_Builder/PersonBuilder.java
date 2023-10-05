package ArkhitekturaPO.Practocal.Practical_2.Pattern_Builder;

public class PersonBuilder {
    private String firstName;
    private String secondName;
    private int age;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public PersonBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(firstName, secondName, age);
    }
}
