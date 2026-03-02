package org.example;

public class Main {

    public static void main(String[] args) {


        ConsultationPatient cp1 = new ConsultationPatient("Ana", "López García", "001", "10/10/2026", "Maria");
        ConsultationPatient cp2 = new ConsultationPatient("Luis", "Pérez Medina", "002", "12/10/2026", "Carlos");

        AmbulancePatient ap1 = new AmbulancePatient("Pedro", "Gómez Álvarez", "003", "Accidente", true);
        AmbulancePatient ap2 = new AmbulancePatient("Laura", "Diaz Sande", "004", "Ataque al corazón", true);

        SpecialistDoctor sd1 = new SpecialistDoctor("Dr. Juan", "Martinez Doporto", "Médico especialista", "LIC123");
        SpecialistDoctor sd2 = new SpecialistDoctor("Dr. Marta", "Ruiz Ríos", "Médico especialista", "LIC456");

        StudentDoctor st1 = new StudentDoctor("Carlos", "Sanchez Moratón", "Estudiante", "Santiago");
        StudentDoctor st2 = new StudentDoctor("Lucía", "Fernandez Becerra", "Estudiante", "Santiago");


        Character[] hospitalMembers = {
                cp1, cp2, ap1, ap2,
                sd1, sd2, st1, st2
        };


        System.out.println("\n===== PACIENTES =====");

        Patient[] patients = {cp1, cp2, ap1, ap2};

        for (Patient patient : patients) {

            patient.showInfo();

            if (patient instanceof ConsultationPatient) {
                ConsultationPatient cp = (ConsultationPatient) patient;
                cp.admission();
                cp.nurseCheckUp();
                cp.room();
                cp.treatment();
                cp.nextAppointment();
                cp.discharge();
            }

            if (patient instanceof AmbulancePatient) {
                AmbulancePatient ap = (AmbulancePatient) patient;
                ap.admission();
                ap.operation();
                ap.room();
                ap.treatment();
                ap.rehabilitation();
                ap.discharge();
            }

            System.out.println("----------------------------");
        }


        System.out.println("\n===== MÉDICOS =====");

        MedicalStaff[] doctors = {sd1, sd2, st1, st2};

        for (MedicalStaff doctor : doctors) {

            doctor.showInfo();

            if (doctor instanceof SpecialistDoctor) {
                SpecialistDoctor sd = (SpecialistDoctor) doctor;
                sd.weeklyWorkingHours();
                sd.eat();
                sd.vacationDays();
                sd.specialty();
            }

            if (doctor instanceof StudentDoctor) {
                StudentDoctor st = (StudentDoctor) doctor;
                st.weeklyWorkingHours();
                st.weeklyStudyHours();
                st.eat();
                st.currentCourse();
            }

            System.out.println("----------------------------");
        }
    }
}