package org.example;

public class AmbulancePatient extends Patient
        implements CommonPatient, AmbulanceActions {

    private String emergency;
    private boolean surgeryRequired;

    public AmbulancePatient(String name, String surname, String medicalRecordNumber,
                            String emergency, boolean surgeryRequired) {
        super(name, surname, medicalRecordNumber);
        this.emergency = emergency;
        this.surgeryRequired = surgeryRequired;
    }

    @Override
    public void admission() {
        System.out.println("Ingreso de emergencia.");
    }

    @Override
    public void operation() {
        System.out.println("Operación en curso.");
    }

    @Override
    public void room() {
        System.out.println("Paciente asignado a UCI.");
    }

    @Override
    public void treatment() {
        System.out.println("Se aplicó tratamiento de emergencia.");
    }

    @Override
    public void rehabilitation() {
        System.out.println("Comenzó la rehabilitación.");
    }

    @Override
    public void discharge() {
        System.out.println("Paciente dado de alta.");
    }

    @Override
    public void showInfo() {
        System.out.println("Paciente de ambulancia: " + getName() + " " + getSurname());
    }
}
