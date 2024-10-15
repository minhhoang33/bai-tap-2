package buoi_6_2;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
    }
}
