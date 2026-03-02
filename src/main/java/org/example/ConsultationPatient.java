package org.example;

public class ConsultationPatient extends Patient implements CommonPatient, ConsultationActions {
    private String appointmentDate;
    private String nurseInCharge;

    public ConsultationPatient(String name, String surname, String medicalRecordNumber, String appointmentDate, String nurseInCharge) {
        super(name, surname, medicalRecordNumber);
        this.appointmentDate = appointmentDate;
        this.nurseInCharge = nurseInCharge;
    }

    @Override
    public void admission() {
        System.out.println("Paciente admitido para consulta.");

    }

    @Override
    public void nurseCheckUp() {
        System.out.println("Chequeo de enfermero/a completado.");

    }

    @Override
    public void room() {
        System.out.println("Paciente asignado a habitación.");

    }

    @Override
    public void treatment() {
        System.out.println("Tratamiento en curso.");

    }

    @Override
    public void nextAppointment() {
        System.out.println("Próxima cita programada.");

    }

    @Override
    public void discharge() {
        System.out.println("Paciente dado de alta.");

    }

    @Override
    public void showInfo() {
        System.out.println("Consultation Patient: " + getName() + " " + getSurname());
    }
}

