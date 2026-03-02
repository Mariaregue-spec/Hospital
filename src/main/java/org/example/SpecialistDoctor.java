package org.example;

public class SpecialistDoctor extends MedicalStaff implements DoctorCommon, MedicalInfo {
    private String licenseNumber;

    public SpecialistDoctor(String name, String surname, String role, String licenseNumber) {
        super(name, surname, role);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void showInfo(){
        System.out.println("Doctor Especialista: " + getName());
    }

    @Override
    public void weeklyWorkingHours(){
        System.out.println("Trabaja 40 horas por semana.");
    }

    @Override
    public void eat() {
        System.out.println("El Doctor está comiendo.");
    }

    @Override
    public void vacationDays() {
        System.out.println("Tiene 30 días de vacaciones.");
    }

    @Override
    public void specialty() {
        System.out.println("Doctor Especialista en Cardiología");
    }
}

