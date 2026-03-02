package org.example;

public class StudentDoctor extends MedicalStaff
        implements DoctorCommon, StudentInfo {

    private String university;

    public StudentDoctor(String name, String surname, String role,
                         String university) {
        super(name, surname, role);
        this.university = university;
    }

    @Override
    public void weeklyWorkingHours() {
        System.out.println("Trabaja 30 horas a la semana.");
    }

    @Override
    public void weeklyStudyHours() {
        System.out.println("Estudia 20 horas a la semana.");
    }

    @Override
    public void eat() {
        System.out.println("El estudiante está comiendo.");

    }

    @Override
    public void currentCourse() {
        System.out.println("Actualmente en rotación de Cirugía.");
    }

    @Override
    public void showInfo() {
        System.out.println("Student Doctor: " + getName());
    }
}
