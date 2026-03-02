package org.example;

public class ConsultationPatient extends Patient implements CommonPatient, ConsultationActions {
    private String appointmentDate;
    private String nurseInCharge;

    public ConsultationPatient(String name, String surname, String medicalRecordNumber,String appointmentDate, String nurseInCharge) {
        super(name, surname, medicalRecordNumber);
        this.appointmentDate = appointmentDate;
        this.nurseInCharge = nurseInCharge;
    }

    @Override
            System.out.println("Paciente admitido para consulta.") {

    }

    @Override
            System.out.println("Chequeo de enfermero/a completado.") {

    }

    @Override
            System.out.println("Paciente asignado a habitación.") {

    }

    @Override
            System.out.println("Tratamiento en curso.") {

    }

    @Override
            System.out.println("Próxima cita programada.") {

    }

    @Override
        System.out.pirntln("Paciente dado de alta.") {

    }

    @Override
            System.out.println("Consultation Patient: " + getName() + " " + getSurname());

    }
}
