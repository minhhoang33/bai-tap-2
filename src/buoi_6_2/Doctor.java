package buoi_6_2;

class Doctor extends Person {
    private String specialty;
    private int workingHours;

    public Doctor(String name, int age, String specialty, int workingHours) {
        super(name, age);
        this.specialty = specialty;
        this.workingHours = workingHours;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Chuyen Khoa: " + specialty);
        System.out.println("So gio lam viec: " + workingHours);
    }
}
