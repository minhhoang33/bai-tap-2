package buoi_6_2;

class ManageHospital {
    private Doctor[] doctors;
    private Patient[] patients;

    public ManageHospital(Doctor[] doctors, Patient[] patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    public void displayAllInfo() {
        System.out.println("Thong tin bac si:");
        for (Doctor doctor : doctors) {
            doctor.displayInfo();
            System.out.println("-----------------");
        }

        System.out.println("Thong tin benh nhan:");
        for (Patient patient : patients) {
            patient.displayInfo();
            System.out.println("-----------------");
        }
    }
}
