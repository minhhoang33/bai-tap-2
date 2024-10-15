package buoi_6_2;

class Patient extends Person {
    private String medicalRecordNumber;
    private String admissionDate;

    public Patient(String name, int age, String medicalRecordNumber, String admissionDate) {
        super(name, age);
        this.medicalRecordNumber = medicalRecordNumber;
        this.admissionDate = admissionDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("So benh an: " + medicalRecordNumber);
        System.out.println("Ngay nhap vien: " + admissionDate);
    }
}
