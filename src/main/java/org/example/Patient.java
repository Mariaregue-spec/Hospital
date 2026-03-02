package org.example;

public abstract class Patient extends Character {
    private String medicalRecordNumber;

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public Patient(String name, String surname, String medicalRecordNumber) {
        super(name, surname);
        this.medicalRecordNumber = medicalRecordNumber;
    }
}
