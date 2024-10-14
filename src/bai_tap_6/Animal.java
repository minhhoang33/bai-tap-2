package bai_tap_6;

public class Animal {
    private String name;
    private int id;
    private String description;
    private boolean gender; // true for male, false for female

    public Animal(String name, int id, String description, boolean gender) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return "Animal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", gender=" + genderStr +
                '}';
    }
}